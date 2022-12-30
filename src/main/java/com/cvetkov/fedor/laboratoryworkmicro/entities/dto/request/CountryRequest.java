package com.cvetkov.fedor.laboratoryworkmicro.entities.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryRequest {

    private Long id;

    @NotBlank(message = "CountryName is mandatory")
    private String countryName;
}
