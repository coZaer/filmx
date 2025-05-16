package com.example.filmx.dao.repository;

import com.example.filmx.dao.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<FilmEntity,Long> {

}
