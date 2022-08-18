package com.reto.disney.backend.Controller;

import com.reto.disney.backend.Service.MovieSeriesService;
import com.reto.disney.backend.model.MovieSeriesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesSeriesRest {
    @Autowired
    private MovieSeriesService movieSeriesService;

    @GetMapping("")
    public List<MovieSeriesModel> getAllMovies(){
        return movieSeriesService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public MovieSeriesModel saveMovies(@RequestBody MovieSeriesModel movieSeriesModel ){
        return movieSeriesService.save(movieSeriesModel);
    }
}
