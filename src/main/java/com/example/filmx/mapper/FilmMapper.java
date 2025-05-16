package com.example.filmx.mapper;

import com.example.filmx.dto.request.FilmRequest;
import com.example.filmx.dto.response.FilmResponse;
import com.example.filmx.dao.entity.FilmEntity;

public enum FilmMapper {
    FILM_MAPPER;

    public FilmEntity buildFilmEntity(FilmRequest filmRequest){
        return FilmEntity.builder()
                .title(filmRequest.getTitle())
                .genre(filmRequest.getGenre())
                .director(filmRequest.getDirector())
                .releaseYear(filmRequest.getReleaseYear())
                .description(filmRequest.getDescription())
                .build();
    }

    public FilmResponse buildFilmResponse(FilmEntity filmEntity){
        return FilmResponse.builder()
                .id(filmEntity.getId())
                .title(filmEntity.getTitle())
                .genre(filmEntity.getGenre())
                .director(filmEntity.getDirector())
                .releaseYear(filmEntity.getReleaseYear())
                .description(filmEntity.getDescription())
                .build();
    }
}
