package com.cvetkov.fedor.laboratoryworkmicro.entities.model;

import com.cvetkov.fedor.laboratoryworkmicro.utils.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "roles", schema = "users")
@Data
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank(message = "Role is mandatory")
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;
}
