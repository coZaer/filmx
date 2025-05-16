package com.example.filmx.impl;

import com.example.filmx.dto.request.FilmRequest;
import com.example.filmx.dto.response.FilmResponse;
import com.example.filmx.dao.entity.FilmEntity;
import com.example.filmx.exception.NotFoundException;
import com.example.filmx.mapper.FilmMapper;
import com.example.filmx.dao.repository.FilmRepository;
import com.example.filmx.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class FilmImpl implements FilmService {
    private FilmRepository filmRepository;

    @Override
    public void saveFilm(FilmRequest filmRequest) {
        FilmEntity filmEntity = FilmMapper.FILM_MAPPER.buildFilmEntity(filmRequest);
        filmRepository.save(filmEntity);
    }

    @Override
    public void deleteById(Long id) {
        filmRepository.deleteById(id);
    }

    @Override
    public FilmResponse getById(Long id) {
        FilmEntity filmEntity = filmRepository.findById(id).orElseThrow(() -> new NotFoundException("Film cannot found"));
        return FilmMapper.FILM_MAPPER.buildFilmResponse(filmEntity);
    }

    @Override
    public List<FilmResponse> getAll(int page, int count) {
        Page<FilmEntity> all = filmRepository.findAll(PageRequest.of(page, count));
        List<FilmResponse> list = all.getContent().stream().map(filmEntity -> FilmMapper.FILM_MAPPER.buildFilmResponse(filmEntity)).toList();
        return list;
    }

    @Override
    public void updateById(Long id, FilmRequest filmRequest) {
        FilmEntity filmEntity = filmRepository.findById(id).orElseThrow(() -> new NotFoundException("Film cannot found"));
        filmEntity.setTitle(filmRequest.getTitle());
        filmEntity.setGenre(filmRequest.getGenre());
        filmEntity.setDirector(filmRequest.getDirector());
        filmEntity.setReleaseYear(filmRequest.getReleaseYear());
        filmEntity.setDescription(filmRequest.getDescription());
        filmRepository.save(filmEntity);
    }
}
