package com.hazydazy.user_service.api.services;

import com.hazydazy.user_service.api.enitites.User;
import com.hazydazy.user_service.api.repositories.UserRepository;
import com.hazydazy.user_service.domain.dtos.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;
    private final PasswordService passwordService;

    public User register(UserDTO userDto) {
        User user = User.builder()
    }

}
