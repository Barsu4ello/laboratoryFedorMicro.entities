package com.cvetkov.fedor.laboratoryworkmicro.entities.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAndAudioRequest {

    @NotNull(message = "userId is mandatory")
//    private Long userId;
    private String userId;

    @NotNull(message = "audiosId is mandatory")
    private List<Long> audiosId;
}
