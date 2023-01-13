package com.cvetkov.fedor.laboratoryworkmicro.entities.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "audios", schema = "audios")
@Setter
@Getter
@NoArgsConstructor
public class Audio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "Title is mandatory")
    @Column(name = "title")
    private String title;

    @Column(name = "audio")
    private byte[] audio;

    @NotNull(message = "Title is mandatory")
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;


//    @ManyToMany
//    @JoinTable(
//            name = "uploaded_by_users",
//            joinColumns = @JoinColumn(name = "audio_id"),
//            inverseJoinColumns = @JoinColumn(name = "user_id"))
//    private List<User> users;

    @Override
    public String toString() {
        return "Audio{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author.getId() +
                '}';
    }
}
