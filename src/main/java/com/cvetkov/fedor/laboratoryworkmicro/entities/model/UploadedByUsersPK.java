package com.cvetkov.fedor.laboratoryworkmicro.entities.model;


import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class UploadedByUsersPK implements Serializable {

    private Long userid;

    private Long audioId;
}
