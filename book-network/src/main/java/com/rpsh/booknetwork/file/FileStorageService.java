package com.rpsh.booknetwork.file;


import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.lang.System.currentTimeMillis;

@Service
@RequiredArgsConstructor
@Slf4j
public class FileStorageService {

    @Value("${spring.application.file.upload.photos-output-path}")
    private String fileUploadPath;

    public String saveFile(@NotNull MultipartFile sourceFile, @NotNull Integer userId) {

        final String fileUploadSubPath = "users" + File.separator + userId;


        return uploadFile(sourceFile, fileUploadSubPath);
    }

    private String uploadFile(@NotNull MultipartFile sourceFile, @NotNull String fileUploadSubPath) {
        final String finalUploadPath = fileUploadPath + File.separator + fileUploadSubPath;
        File targetFolder = new File(finalUploadPath);
        if (!targetFolder.exists()) {
            boolean
                    folderCreated = targetFolder.mkdirs();
            if (!folderCreated){
                log.warn("Failed to create the target folder");
                return null;
            }
        }

        final String fileExtension = getFileExtension(sourceFile.getOriginalFilename());
        String targetFilePath = finalUploadPath + File.separator + currentTimeMillis() + "." + fileExtension;
        Path targetPath = Paths.get(targetFilePath);
        try {
            Files.write(targetPath,sourceFile.getBytes());
            log.info("File saved to{}", fileUploadPath);
            return targetFilePath;
        }catch (IOException e){
            log.error("File was not saved",e);
        }
        return null;
    }

    private String getFileExtension(String filename) {
        if(filename == null || filename.isEmpty()){
            return "";
        }
        int lastDotIndex = filename.lastIndexOf('.');
        if(lastDotIndex == -1){
            return "";
        }

        return filename.substring(lastDotIndex + 1).toLowerCase();
    }

}
