package com.reto.disney.backend.Controller;

import com.reto.disney.backend.Service.CharacterMovieService;
import com.reto.disney.backend.Service.MovieSeriesService;
import com.reto.disney.backend.model.CharacterModel;
import com.reto.disney.backend.model.CharacterMovieModel;
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
    @Autowired
    private CharacterMovieService characterMovieService;

    @GetMapping("")
    public List<MovieSeriesModel> getAllMovies(){
        return movieSeriesService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public MovieSeriesModel saveMovies(@RequestBody MovieSeriesModel movieSeriesModel ){
        return movieSeriesService.save(movieSeriesModel);
    }

    @PostMapping("/{idMovie}/characters/{idCharacter}")
    public CharacterMovieModel newCharacterMovie(@PathVariable Long idMovie, @PathVariable Long idCharacter){
        return characterMovieService.save(new CharacterMovieModel(new CharacterModel(idCharacter), new MovieSeriesModel(idMovie)));
    }

    @GetMapping("/series/characters")
    public List<CharacterMovieModel> getAll(){
        return characterMovieService.findAll();
    }
}
