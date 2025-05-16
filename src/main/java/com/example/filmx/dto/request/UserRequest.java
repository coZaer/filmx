package com.example.filmx.dto.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.management.relation.Role;
import java.util.List;
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class UserRequest {

    String username;

    String email;

    String password;

    List<Role> roles ;
}
