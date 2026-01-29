package com.hazydazy.user_service.api.repositories;

import com.hazydazy.user_service.api.enitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> getUserById();
    Optional<User> getUserByUsername();
    Optional<User> getUserByEmail();
}
