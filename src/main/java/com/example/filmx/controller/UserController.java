package com.example.filmx.controller;

import com.example.filmx.dto.request.UserRequest;
import com.example.filmx.dto.response.UserResponse;
import com.example.filmx.service.FilmService;
import com.example.filmx.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor

public class UserController {
    private final FilmService filmService;
    private UserService userService;


    @PostMapping
    public void save(@RequestBody UserRequest userRequest){
            userService.saveUser(userRequest);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id){
        userService.deleteById(id);
    }

    @GetMapping("/{id}")
    public UserResponse getById(@PathVariable Long id){
        return userService.getById(id);
    }

    @GetMapping
    public List<UserResponse> getAll(@RequestParam int page,@RequestParam int count){
        return userService.getAll(page, count);
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable Long id,@RequestBody UserRequest userRequest){
        userService.updateById(id,userRequest);
    }
}
