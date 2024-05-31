package com.rpsh.booknetwork.feedback;


import com.rpsh.booknetwork.book.Book;
import com.rpsh.booknetwork.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Feedback extends BaseEntity {


    private Double note;
    private String comment;


    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

}
