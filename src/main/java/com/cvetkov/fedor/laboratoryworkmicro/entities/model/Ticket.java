package com.cvetkov.fedor.laboratoryworkmicro.entities.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tickets", schema = "concerts")
@Setter
@Getter
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Positive(message = "Price must be greater than zero")
    @Column(name = "price")
    private Integer price;

    @NotNull(message = "Concert is mandatory")
    @ManyToOne
    @JoinColumn(name = "concert_id")
    private Concert concert;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;

    //(c KeyCloak это не надо) НЕ ЗАБУДЬ В БД ТИП ИЗМЕНИТЬ ЕСЛИ БУДЕШЬ НАЗАД ВСЕ ПЕРЕКРУЧИВАТЬ
//    @Column(name = "user_id")
//    private Long userid;

    @Column(name = "user_id")
    private String userId;

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", price=" + price +
                ", concert=" + concert +
                ", userid=" + userId +
                '}';
    }
}
