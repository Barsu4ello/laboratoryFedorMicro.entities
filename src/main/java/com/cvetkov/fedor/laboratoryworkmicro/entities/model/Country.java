package com.cvetkov.fedor.laboratoryworkmicro.entities.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "countries", schema = "concerts")
@Setter
@Getter
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "CountryName is mandatory")
    @Column(name = "country_name")
    private String countryName;

    @OneToMany(
            mappedBy = "country",
            fetch = FetchType.LAZY,
            cascade = CascadeType.REMOVE)
    private List<City> cities;

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
