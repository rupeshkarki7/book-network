package com.rpsh.booknetwork.book;


import com.rpsh.booknetwork.user.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookResponse {

    private Integer id;
    private String title;
    private String authorName;
    private String isbn;
    private String synopsis;
    private User owner;
    private byte[] cover;
    private double rate;
    private boolean archived;
    private boolean shareable;


}
