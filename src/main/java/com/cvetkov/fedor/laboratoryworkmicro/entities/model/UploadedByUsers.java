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


    //(c KeyCloak это не надо) НЕ ЗАБУДЬ В БД ТИП ИЗМЕНИТЬ ЕСЛИ БУДЕШЬ НАЗАД ВСЕ ПЕРЕКРУЧИВАТЬ
//    private Long userId;
    private String userId;

//    @Id
//    @Column(value = "audio_id")
    private Long audioId;
}
