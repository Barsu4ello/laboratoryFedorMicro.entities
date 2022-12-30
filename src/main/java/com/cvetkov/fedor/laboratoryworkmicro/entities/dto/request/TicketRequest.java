package com.cvetkov.fedor.laboratoryworkmicro.entities.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketRequest {

    private Long id;
    @Positive(message = "Price must be greater than zero")
    private Integer price;

    @NotNull(message = "Concert is mandatory")
    private Long concertId;

    private Long userId;
}
