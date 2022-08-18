package com.reto.disney.backend.Service;

import com.reto.disney.backend.Repository.MovieSerieRepository;
import com.reto.disney.backend.model.MovieSeriesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
