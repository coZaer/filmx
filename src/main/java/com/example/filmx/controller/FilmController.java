package com.example.filmx.controller;

import com.example.filmx.dto.request.FilmRequest;
import com.example.filmx.dto.response.FilmResponse;
import com.example.filmx.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
@RequiredArgsConstructor

public class FilmController {
    private  FilmService filmService ;


    @PostMapping
    public void save(@RequestBody FilmRequest filmRequest){
        filmService.saveFilm(filmRequest);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        filmService.deleteById(id);
    }

    @GetMapping("/{id}")
    public FilmResponse getById(@PathVariable Long id){
        return filmService.getById(id);
    }

    @GetMapping
    public List<FilmResponse> getAll(@RequestParam int page,@RequestParam int count){
        return filmService.getAll(page,count);
    }
    @PutMapping("/{id}")
    public void updateById(@PathVariable Long id,@RequestBody FilmRequest filmRequest){
        filmService.updateById(id, filmRequest);
    }

}
