package com.rpsh.booknetwork.handler;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;


@Getter
public enum BusinessErrorCodes {
    NO_CODE(0, NOT_IMPLEMENTED,"No Code!"),

    INCORRECT_CURRENT_PASSWORD(300,BAD_REQUEST,"Incorrect Current Password!"),
    NEW_PASSWORD_DOES_NOT_MATCH(301,BAD_REQUEST,"The new password doesn't match"),
    ACCOUNT_LOCKED(302,FORBIDDEN,"User account is locked"),
    ACCOUNT_DISABLED(303,FORBIDDEN,"User account is disabled"),
    BAD_CREDENTIALS(304, FORBIDDEN,"Email / password isn't correct.")
    ;
    private final int code;
    private final String description;
    private final HttpStatus httpStatus;


    BusinessErrorCodes(int code, HttpStatus httpStatus, String description) {
        this.code = code;
        this.httpStatus = httpStatus;
        this.description = description;
    }
}
