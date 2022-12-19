package com.reto.disney.backend.model;

import com.fasterxml.jackson.annotation.*;
import com.reto.disney.backend.DTO.CharacterDTO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name = "movie_serie")
public class MovieSeriesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long id;
    private String img;
    private String title;
    @Column(name = "creation_date")
    private Date creationDate;
    private double qualification;
    @OneToOne
    @JoinColumn(name = "name_genre")
    GenreModel Genre;
    @ManyToMany(mappedBy = "movies", cascade = CascadeType.MERGE)
    @JsonIgnoreProperties("movies")
    private List<CharacterModel> characters= new ArrayList<>();


    public MovieSeriesModel(Long id, String img, String title, Date creationDate, double qualification, GenreModel genre, List<CharacterModel> characters) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.creationDate = creationDate;
        this.qualification = qualification;
        Genre = genre;
        this.characters = characters;
    }

    public MovieSeriesModel(Long id) {
        this.id = id;
    }

    public MovieSeriesModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public double getQualification() {
        return qualification;
    }

    public void setQualification(double qualification) {
        this.qualification = qualification;
    }

    public GenreModel getGenre() {
        return Genre;
    }

    public void setGenre(GenreModel genre) {
        Genre = genre;
    }

    public List<CharacterModel> getCharacters() {
        return characters;
    }

    public void setCharacters(List<CharacterModel> characters) {
        this.characters = characters;
    }
}
