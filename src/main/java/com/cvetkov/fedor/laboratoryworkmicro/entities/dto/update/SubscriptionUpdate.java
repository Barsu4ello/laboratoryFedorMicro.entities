package com.cvetkov.fedor.laboratoryworkmicro.entities.dto.update;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionUpdate {

    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @Positive(message = "Price must be greater than zero")
    private Integer price;

    @NotBlank(message = "Description is mandatory")
    private String description;
}
