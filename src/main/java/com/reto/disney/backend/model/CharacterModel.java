package com.reto.disney.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table (name = "characters")
public class CharacterModel {
    @JsonIgnore
    @Id
    @Column(name = "character_id")
    @GeneratedValue (strategy = GenerationType.TABLE)
    private Long id;
    private String name;
    private String image;
    private int age;
    private String history;
    private int weight;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "character_movie",
            joinColumns = @JoinColumn(name = "fk_character_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_movie_id")
    )
    private Set<MovieSeriesModel> movies;

    public CharacterModel() {
    }

    public CharacterModel(Long id, String name, String image, int age, String history, int weight, Set<MovieSeriesModel> movies) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.age = age;
        this.history = history;
        this.weight = weight;
        this.movies = movies;
    }

    public CharacterModel(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Set<MovieSeriesModel> getMovies() {
        return movies;
    }

    public void setMovies(Set<MovieSeriesModel> movies) {
        this.movies = movies;
    }
}
