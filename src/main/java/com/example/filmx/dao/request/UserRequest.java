package com.example.filmx.dao.request;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class UserRequest {

    String username;

    String email;

    String password;

    List<Role> roles ;
}
