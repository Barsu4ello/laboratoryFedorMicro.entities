package com.cvetkov.fedor.laboratoryworkmicro.entities.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_subscriptions", schema = "subscriptions")
@Setter
@Getter
@NoArgsConstructor
public class UserSubscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull(message = "IsValid is mandatory")
    @Column(name = "is_valid")
    private boolean isValid;

    @NotNull(message = "Subscription is mandatory")
    @ManyToOne
    @JoinColumn(name = "subscription_id")
    private Subscription subscription;

//    @NotNull(message = "User is mandatory")
//    @OneToOne
//    @JoinColumn(name = "host_user_id")
//    private User user;

    //(c KeyCloak это не надо) НЕ ЗАБУДЬ В БД ТИП ИЗМЕНИТЬ ЕСЛИ БУДЕШЬ НАЗАД ВСЕ ПЕРЕКРУЧИВАТЬ
//    @NotNull(message = "User is mandatory")
//    @Column(name = "host_user_id")
//    private Long userid;
//

    @Column(name = "user_id")
    private String userId;

    @Override
    public String toString() {
        return "UserSubscription{" +
                "id=" + id +
                ", isValid=" + isValid +
                ", subscription=" + subscription.getId() +
                ", user=" + userId +
                '}';
    }
}
