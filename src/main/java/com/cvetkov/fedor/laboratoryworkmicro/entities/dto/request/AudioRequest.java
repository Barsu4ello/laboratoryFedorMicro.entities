package com.cvetkov.fedor.laboratoryworkmicro.entities.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AudioRequest {

    private Long id;

    @NotBlank(message = "Title is mandatory")
    private String title;

    private byte[] audio;

    @NotNull(message = "Author is mandatory")
    private Long authorId;
}
