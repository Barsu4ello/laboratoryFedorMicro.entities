package com.cvetkov.fedor.laboratoryworkmicro.entities.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSubscriptionResponse {

    private Long id;
    private boolean isValid;
    private Long subscription;
    private Long user;
}
