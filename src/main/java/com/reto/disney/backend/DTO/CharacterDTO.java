package com.reto.disney.backend.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.reto.disney.backend.model.CharacterModel;

public class CharacterDTO extends CharacterModel {
    private String image;
    private String name;
    @JsonIgnore
    private int age;
    @JsonIgnore
    private String history;
    @JsonIgnore
    private int weight;

    public CharacterDTO() {
    }

    public CharacterDTO(String image, String name) {
        this.image = image;
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
