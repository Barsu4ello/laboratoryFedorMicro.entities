package com.cvetkov.fedor.laboratoryworkmicro.entities.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorResponse {

    private Long id;
    private String name;
    private String description;
}
