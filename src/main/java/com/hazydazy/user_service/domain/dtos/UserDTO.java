package com.hazydazy.user_service.domain.dtos;

import lombok.Data;

@Data
public class UserDTO {
    private String username;
    private String password;
    private String email;
}
