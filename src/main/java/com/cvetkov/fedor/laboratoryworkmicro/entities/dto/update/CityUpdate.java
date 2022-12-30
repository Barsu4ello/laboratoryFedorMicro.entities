package com.cvetkov.fedor.laboratoryworkmicro.entities.dto.update;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityUpdate {

    private Long id;

    @NotBlank(message = "CityName is mandatory")
    private String cityName;

    @NotNull(message = "Country is mandatory")
    private Long countryId;
}
