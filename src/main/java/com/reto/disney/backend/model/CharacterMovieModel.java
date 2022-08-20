package com.reto.disney.backend.model;

import com.reto.disney.backend.model.CharacterModel;
import com.reto.disney.backend.model.MovieSeriesModel;

import javax.persistence.*;

@Entity
@Table(name = "character_movie")
public class CharacterMovieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_character_id", referencedColumnName = "character_id", insertable = true, updatable = false)
    private CharacterModel characterModel;

    @ManyToOne
    @JoinColumn(name = "fk_movie_id", referencedColumnName = "movie_id", insertable = true, updatable = false)
    private MovieSeriesModel movieSeriesModel;

    public CharacterMovieModel() {
    }

    public CharacterMovieModel(CharacterModel characterModel, MovieSeriesModel movieSeriesModel) {
        this.characterModel = characterModel;
        this.movieSeriesModel = movieSeriesModel;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
