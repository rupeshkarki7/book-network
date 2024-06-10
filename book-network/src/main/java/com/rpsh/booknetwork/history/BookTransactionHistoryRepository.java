package com.rpsh.booknetwork.history;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookTransactionHistoryRepository extends JpaRepository<BookTransactionHistory, Integer > {

    @Query("""
            Select history
            FROM BookTransactionHistory history
            where history.user.id = :userId
            """)
    Page<BookTransactionHistory> findAllBorrowedBooks(Pageable pageable, Integer userId);


    @Query("""
            Select history
            FROM BookTransactionHistory history
            where history.book.owner.id = :userId
            """)
    Page<BookTransactionHistory> findAllReturnedBooks(Pageable pageable, Integer userid);

    @Query("""
            Select 
            (count(*) > 0) as isBorrowed
            from BookTransactionHistory history
            where history.user.id = :userId
            and history.book.id = :bookId
            and history.returnApproved = false 
            """)
    boolean isAlreadyBorrowedByUser(Integer bookId, Integer userId);

}
