package com.cvetkov.fedor.laboratoryworkmicro.entities.dto.request;

import com.cvetkov.fedor.laboratoryworkmicro.utils.enums.UserStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    private Long id;

    @NotBlank(message = "Username is mandatory")
    private String username;

    @NotBlank(message = "Password is mandatory")
    private String password;

    @NotNull(message = "Status is mandatory")
    private UserStatus status;

    @NotNull(message =  "Role is mandatory")
    private Integer roleId;

    private Long cityId;

    private Long authorId;
}
