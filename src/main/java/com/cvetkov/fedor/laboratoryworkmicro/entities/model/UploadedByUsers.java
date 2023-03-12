package com.cvetkov.fedor.laboratoryworkmicro.entities.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

//@Entity
//@Table(name = "uploaded_by_users", schema = "audios")
//@Setter
//@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "uploaded_by_users", schema = "audios")
@Data
//@IdClass(UploadedByUsersPK.class)
public class UploadedByUsers {

//    @Id
//    @Column(value = "user_id")
//    @Id

    private Long userId;

//    @Id
//    @Column(value = "audio_id")
    private Long audioId;
}
