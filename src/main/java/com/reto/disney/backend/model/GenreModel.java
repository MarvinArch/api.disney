package com.reto.disney.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "genre")
public class GenreModel {
    @Id
    private String name;
    private String image;

    public GenreModel() {
    }

    public GenreModel(String name, String image) {
        this.name = name;
        this.image = image;
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
}
