package com.reto.disney.backend.Service;

import com.reto.disney.backend.Repository.CharacterMovieRepository;
import com.reto.disney.backend.model.CharacterMovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterMovieService {
    @Autowired
    private CharacterMovieRepository characterMovieRepository;

    public List<CharacterMovieModel> findAll() {
        return characterMovieRepository.findAll();
    }

    public CharacterMovieModel save(CharacterMovieModel characterMovieModel) {
        return characterMovieRepository.save(characterMovieModel);
    }
}
