package com.cvetkov.fedor.laboratoryworkmicro.entities.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AudioResponse {

    private Long id;
    private String title;
    private byte[] audio;
    private Long author;
}
