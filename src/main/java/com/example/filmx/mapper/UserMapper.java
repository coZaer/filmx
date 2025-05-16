package com.example.filmx.mapper;

import com.example.filmx.dto.request.UserRequest;
import com.example.filmx.dto.response.UserResponse;
import com.example.filmx.dao.entity.UserEntity;

public enum UserMapper {
    USER_MAPPER;

    public UserEntity buildUserEntity(UserRequest userRequest){
        return UserEntity.builder()
                .username(userRequest.getUsername())
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .roles(userRequest.getRoles())
                .build();
    }

    public UserResponse buildUserResponse(UserEntity userEntity){
        return UserResponse.builder()
                .username(userEntity.getUsername())
                .email(userEntity.getEmail())
                .password(userEntity.getPassword())
                .roles(userEntity.getRoles())
                .build();
    }
}
