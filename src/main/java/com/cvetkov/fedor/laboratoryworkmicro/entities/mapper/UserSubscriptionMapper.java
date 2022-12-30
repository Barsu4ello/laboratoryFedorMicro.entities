package com.cvetkov.fedor.laboratoryworkmicro.entities.mapper;

import com.cvetkov.fedor.laboratoryworkmicro.entities.dto.request.UserSubscriptionRequest;
import com.cvetkov.fedor.laboratoryworkmicro.entities.dto.response.UserSubscriptionResponse;
import com.cvetkov.fedor.laboratoryworkmicro.entities.dto.update.UserSubscriptionUpdate;
import com.cvetkov.fedor.laboratoryworkmicro.entities.model.UserSubscription;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class UserSubscriptionMapper {

    private final ModelMapper mapper;

    @PostConstruct
    public void setupMapper() {
        mapper.createTypeMap(UserSubscription.class, UserSubscriptionResponse.class)
                .addMappings(m -> m.skip(UserSubscriptionResponse::setSubscription))
                .setPostConverter(toUserSubscriptionResponseConverter());
    }

    private Converter<UserSubscription, UserSubscriptionResponse> toUserSubscriptionResponseConverter() {
        return context -> {
            UserSubscription source = context.getSource();
            UserSubscriptionResponse destination = context.getDestination();
            destination.setSubscription(source.getSubscription().getId());
            return context.getDestination();
        };
    }

    public UserSubscriptionResponse userSubscriptionToUserSubscriptionResponse(UserSubscription userSubscription) {
        return mapper.map(userSubscription, UserSubscriptionResponse.class);
    }

    public UserSubscription userSubscriptionRequestToUserSubscription(UserSubscriptionRequest request) {
        return mapper.map(request, UserSubscription.class);
    }

    public UserSubscription userSubscriptionUpdateToUserSubscription(UserSubscriptionUpdate update) {
        return mapper.map(update, UserSubscription.class);
    }

    public List<UserSubscriptionResponse> userSubscriptionToUserSubscriptionResponseList(List<UserSubscription> userSubscription) {
        return userSubscription
                .stream()
                .map(this::userSubscriptionToUserSubscriptionResponse)
                .collect(Collectors.toList());
    }

    public Page<UserSubscriptionResponse> userSubscriptionTUserSubscriptionResponsePage(Page<UserSubscription> userSubscriptionPage) {
        return userSubscriptionPage
                .map(this::userSubscriptionToUserSubscriptionResponse);
    }

}
