package com.reto.disney.backend.Service;

import com.reto.disney.backend.Repository.GenreRepository;
import com.reto.disney.backend.model.GenreModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {
    @Autowired
    private GenreRepository genreRepository;


    public List<GenreModel> findAll() {
        return genreRepository.findAll();
    }

    public GenreModel save(GenreModel genreModel) {
        return genreRepository.save(genreModel);
    }
}
