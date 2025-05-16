package com.example.filmx.dao.request;

import jakarta.persistence.Column;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.swing.colorchooser.AbstractColorChooserPanel;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class FilmRequest {
    String title;

    String genre;

    String director;

    int releaseYear;

    String description;
}
