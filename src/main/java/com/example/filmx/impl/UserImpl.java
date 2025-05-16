package com.example.filmx.impl;

import com.example.filmx.dao.request.FilmRequest;
import com.example.filmx.dao.request.UserRequest;
import com.example.filmx.dao.response.UserResponse;
import com.example.filmx.entity.FilmEntity;
import com.example.filmx.entity.UserEntity;
import com.example.filmx.exception.NotFoundException;
import com.example.filmx.mapper.UserMapper;
import com.example.filmx.repository.UserRepository;
import com.example.filmx.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public void saveUser(UserRequest userRequest){
        UserEntity userEntity = UserMapper.USER_MAPPER.buildUserEntity(userRequest);
        userRepository.save(userEntity);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserResponse getById(Long id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(() -> new NotFoundException("User cannot found"));
        return UserMapper.USER_MAPPER.buildUserResponse(userEntity);
    }

    @Override
    public List<UserResponse> getAll(int page, int count) {
        Page<UserEntity> all = userRepository.findAll(PageRequest.of(page, count));
        List<UserResponse> list = all.getContent().stream().map(userEntity -> UserMapper.USER_MAPPER.buildUserResponse(userEntity)).toList();
        return list;
    }

    @Override
    public void updateById(Long id, UserRequest userRequest) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(() -> new NotFoundException("User cannot found"));
        userEntity.setUsername(userRequest.getUsername());
        userEntity.setEmail(userRequest.getEmail());
        userEntity.setPassword(userRequest.getPassword());
        userEntity.setRoles(userRequest.getRoles());
        userRepository.save(userEntity);
    }

}
