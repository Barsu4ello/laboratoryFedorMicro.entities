package com.cvetkov.fedor.laboratoryworkmicro.entities.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "uploaded_by_users", schema = "audios")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(UploadedByUsersPK.class)
public class UploadedByUsers {

    @Id
    @Column(name = "user_id")
    private Long userid;

    @Id
    @Column(name = "audio_id")
    private Long audioId;
}
