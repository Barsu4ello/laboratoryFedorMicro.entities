package com.cvetkov.fedor.laboratoryworkmicro.entities.dto.update;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSubscriptionUpdate {

    private Long id;

    @NotNull(message = "IsValid is mandatory")
    private boolean isValid;

    @NotNull(message = "Subscription is mandatory")
    private Long subscriptionId;

    @NotNull(message = "User is mandatory")
    private Long hostUserId;
}
