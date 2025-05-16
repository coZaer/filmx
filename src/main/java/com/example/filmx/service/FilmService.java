package com.example.filmx.service;

import com.example.filmx.dao.request.FilmRequest;
import com.example.filmx.dao.response.FilmResponse;

import java.util.List;

public interface FilmService {
    void saveFilm(FilmRequest filmRequest);
    void deleteById(Long id);
    FilmResponse getById(Long id);
    List<FilmResponse> getAll(int page,int count);
    void updateById(Long id,FilmRequest filmRequest);

}
