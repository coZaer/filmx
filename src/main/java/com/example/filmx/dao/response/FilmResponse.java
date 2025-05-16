package com.example.filmx.dao.response;

import jakarta.persistence.Column;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
public class FilmResponse {
    Long id;

    String title;

    String genre;

    String director;

    int releaseYear;

    String description;

}
