package com.cvetkov.fedor.laboratoryworkmicro.entities.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "authors_users", schema = "audios")
@Setter
@Getter
@NoArgsConstructor
@IdClass(UsersAuthorsPK.class)
public class UsersAuthors {

    @Id
    @Column(name = "user_id")
    private Long userid;

    @Id
    @Column(name = "author_id")
    private Long authorId;
}
