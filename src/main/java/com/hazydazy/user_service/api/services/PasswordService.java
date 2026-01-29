package com.hazydazy.user_service.api.services;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public String hashPassword(String plain) {
        return encoder.encode(plain);
    }

    public boolean matches(String plain, String hash) {
        return encoder.matches(plain, hash);
    }
}
