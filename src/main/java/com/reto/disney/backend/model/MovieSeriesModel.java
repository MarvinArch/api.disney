package com.reto.disney.backend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "movie_serie")
public class MovieSeriesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String img;
    private String title;
    @Column(name = "creation_date")
    private Date creationDate;
    private double qualification;
    @OneToOne
    @JoinColumn(name = "name_genre")
    GenreModel Genre;

    public MovieSeriesModel(Long id, String img, String title, Date creationDate, double qualification, GenreModel genre) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.creationDate = creationDate;
        this.qualification = qualification;
        Genre = genre;
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
}
