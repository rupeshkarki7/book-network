package com.rpsh.booknetwork.role;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rpsh.booknetwork.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Role {


    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true)
    private String name;

    @ManyToMany(mappedBy = "roles")
    @JsonIgnore
    private List<User> users;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @Column(insertable = false)
    private LocalDateTime lastModifiedDate;

}
