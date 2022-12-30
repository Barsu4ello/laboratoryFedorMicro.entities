package com.cvetkov.fedor.laboratoryworkmicro.entities.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "cities", schema = "concerts")
@Setter
@Getter
@NoArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "CityName is mandatory")
    @Column(name = "city_name")
    private String cityName;

    @NotNull(message = "Country is mandatory")
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

//    @OneToMany(
//            mappedBy = "city",
//            fetch = FetchType.LAZY)
//    private List<User> users;

    @OneToMany(
            mappedBy = "city",
            fetch = FetchType.LAZY,
            cascade = CascadeType.REMOVE)
    private List<Concert> concerts;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", country=" + country.getId() +
                '}';
    }
}
