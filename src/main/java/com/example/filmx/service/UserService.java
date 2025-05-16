package com.example.filmx.service;

import com.example.filmx.dto.request.UserRequest;
import com.example.filmx.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    void saveUser(UserRequest userRequest);
    void deleteById(Long id);
    UserResponse getById(Long id);
    List<UserResponse> getAll(int page, int count);
    void updateById(Long id,UserRequest userRequest);

}
