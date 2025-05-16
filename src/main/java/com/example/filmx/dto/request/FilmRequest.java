package com.example.filmx.dto.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class FilmRequest {
    String title;

    String genre;

    String director;

    int releaseYear;

    String description;
}
