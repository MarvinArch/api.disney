package com.reto.disney.backend.model;

import com.reto.disney.backend.model.CharacterModel;
import com.reto.disney.backend.model.MovieSeriesModel;

import javax.persistence.*;

@Entity
@Table(name = "character_movie")
public class CharacterMovieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "id_character")
    private CharacterModel characterModel;
    @OneToOne
    @JoinColumn(name = "id_movie")
    private MovieSeriesModel movieSeriesModel;

    public CharacterMovieModel() {
    }

    public CharacterMovieModel(CharacterModel characterModel, MovieSeriesModel movieSeriesModel) {
        this.characterModel = characterModel;
        this.movieSeriesModel = movieSeriesModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CharacterModel getCharacterModel() {
        return characterModel;
    }

    public void setCharacterModel(CharacterModel characterModel) {
        this.characterModel = characterModel;
    }

    public MovieSeriesModel getMovieSeriesModel() {
        return movieSeriesModel;
    }

    public void setMovieSeriesModel(MovieSeriesModel movieSeriesModel) {
        this.movieSeriesModel = movieSeriesModel;
    }
}
