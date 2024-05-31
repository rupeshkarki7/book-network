package com.rpsh.booknetwork.book;


import com.rpsh.booknetwork.common.BaseEntity;
import com.rpsh.booknetwork.feedback.Feedback;
import com.rpsh.booknetwork.history.BookTransactionHistory;
import com.rpsh.booknetwork.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor

public class Book extends BaseEntity {

    private String  title;
    private String authorName;
    private String isbn;
    private String  synopsis;
    private String bookCover;
    private boolean archived;
    private boolean shareable;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToMany(mappedBy = "book")
    private Set<Feedback> feedbacks = new LinkedHashSet<>();

    @OneToMany(mappedBy = "book")
    private List<BookTransactionHistory> histories;

}
