package com.cvetkov.fedor.laboratoryworkmicro.entities.model;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UploadedByUsersPK implements Serializable {

    private Long userid;

    private Long audioId;
}
