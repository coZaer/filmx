package com.example.filmx.repository;

import com.example.filmx.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<FilmEntity,Long> {

}
