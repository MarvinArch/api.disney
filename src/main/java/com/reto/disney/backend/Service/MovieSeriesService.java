package com.reto.disney.backend.Service;

import com.reto.disney.backend.Repository.MovieSerieRepository;
import com.reto.disney.backend.model.MovieSeriesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieSeriesService {
    @Autowired
    private MovieSerieRepository movieSerieRepository;

    public List<MovieSeriesModel> findAll() {
        return movieSerieRepository.findAll();
    }

    public MovieSeriesModel save(MovieSeriesModel movieSeriesModel) {
        return movieSerieRepository.save(movieSeriesModel);
    }

    public void deleteById(Long idMovie) {
        movieSerieRepository.deleteById(idMovie);
    }


    public MovieSeriesModel updateByMovie(MovieSeriesModel movie) {
        return movieSerieRepository.save(movie);
    }
}
