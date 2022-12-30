package com.cvetkov.fedor.laboratoryworkmicro.entities.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityRequest {

    private Long id;

    @NotBlank(message = "CityName is mandatory")
    private String cityName;

    @NotNull(message = "Country is mandatory")
    private Long countryId;
}
