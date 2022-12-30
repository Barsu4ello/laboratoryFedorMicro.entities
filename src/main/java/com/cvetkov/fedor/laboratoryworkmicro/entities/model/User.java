package com.cvetkov.fedor.laboratoryworkmicro.entities.model;

import com.cvetkov.fedor.laboratoryworkmicro.utils.enums.UserStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users", schema = "users")
@Setter
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "Username is mandatory")
    @Column(name = "username")
    private String username;

    @NotBlank(message = "Password is mandatory")
    @Column(name = "password")
    private String password;

    @NotNull(message = "UserStatus status is mandatory")
    @Column(name = "user_status")
    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @NotNull(message = "Role is mandatory")
    @ManyToOne
    @JoinColumn(name = "role")
    private RoleEntity role;

//    @ManyToOne //Вообще бы ManyToMany сделать
//    @JoinColumn(name = "author")
//    private Author author;

    @Column(name = "author")
    private Long authorId;

//    @ManyToOne
//    @JoinColumn(name = "city_id")
//    private City city;

    @Column(name = "city_id")
    private Long cityId;

//    @ManyToMany
//    @JoinTable(
//            name = "uploaded_by_users",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "audio_id"))
//    private List<Audio> audios;

//    @OneToOne(
//            mappedBy = "user",
//            fetch = FetchType.LAZY,
//            cascade = CascadeType.REMOVE)
//    private UserSubscription userSubscription;
//
//    @OneToMany(
//            mappedBy = "user",
//            fetch = FetchType.LAZY)
//    private List<Ticket> tickets;

    @OneToMany(
            mappedBy = "user",
            fetch = FetchType.LAZY,
            cascade = CascadeType.REMOVE)
    private List<UserPlaylist> userPlaylists;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", author=" + authorId +
                '}';
    }
}
