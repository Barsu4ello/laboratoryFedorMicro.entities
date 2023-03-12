package com.cvetkov.fedor.laboratoryworkmicro.entities.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.annotation.Id;

//@Entity
//@Table(name = "authors", schema = "audios")
@Data
@NoArgsConstructor
@Table(value = "authors", schema = "audios")
public class Author {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    @Id
    private Long id;

    @NotBlank(message = "Name is mandatory")
//    @Column(name = "name")
    private String name;

    @NotBlank(message = "Description is mandatory")
//    @Column(name = "description")
    private String description;

//    @OneToMany(
//            mappedBy = "author",
//            fetch = FetchType.LAZY)
//    private List<User> users;

//    @OneToMany(
//            mappedBy = "author",
//            fetch = FetchType.LAZY,
//            cascade = CascadeType.REMOVE)
//    private List<Audio> audios;

//    @Override
//    public String toString() {
//        return "Author{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//    }
}
