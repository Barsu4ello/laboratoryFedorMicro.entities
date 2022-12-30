package com.cvetkov.fedor.laboratoryworkmicro.entities.mapper;

import com.cvetkov.fedor.laboratoryworkmicro.entities.dto.request.UserRequest;
import com.cvetkov.fedor.laboratoryworkmicro.entities.dto.response.UserResponse;
import com.cvetkov.fedor.laboratoryworkmicro.entities.dto.update.UserUpdate;
import com.cvetkov.fedor.laboratoryworkmicro.entities.model.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class UserMapper {

    private final ModelMapper mapper;

    public UserResponse userToUserResponse(User user) {
        return mapper.map(user, UserResponse.class);
    }

    public User userRequestToUser(UserRequest request) {
        return mapper.map(request, User.class);
    }

    public User userUpdateToUser(UserUpdate update) {
        return mapper.map(update, User.class);
    }

    public List<UserResponse> userToUserResponseList(List<User> user) {
        return user
                .stream()
                .map(this::userToUserResponse)
                .collect(Collectors.toList());
    }

    public Page<UserResponse> userToUserResponsePage(Page<User> userPage) {
        return userPage
                .map(this::userToUserResponse);
    }
}
