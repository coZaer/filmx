package com.example.filmx.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.management.relation.Role;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
public class UserResponse {

    Long id;

    String username;

    String email;

    String password;

    List<Role> roles;
}
