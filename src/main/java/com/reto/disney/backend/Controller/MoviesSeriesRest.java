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
    //Crear Nueva pelicula
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public MovieSeriesModel saveMovies(@RequestBody MovieSeriesModel movieSeriesModel ){
        return movieSeriesService.save(movieSeriesModel);
    }
    //Editar Pelicula

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("")
    public MovieSeriesModel updateMovie(@RequestBody MovieSeriesModel movie){
        return movieSeriesService.updateByMovie(movie);
    }

    //Eliminar Pelicula
    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/{idMovie}")
    public void deleteMovie(@PathVariable Long idMovie){
        movieSeriesService.deleteById(idMovie);
    }
    //Agregar Personaje a pelicula
    @PostMapping("/{idMovie}/characters/{idCharacter}")
    public CharacterMovieModel newCharacterMovie(@PathVariable Long idMovie, @PathVariable Long idCharacter){
        return characterMovieService.save(new CharacterMovieModel(new CharacterModel(idCharacter), new MovieSeriesModel(idMovie)));
    }
    //Mostrara todas las peliculas y personaje
    @GetMapping("/series/characters")
    public List<CharacterMovieModel> getAll(){
        return characterMovieService.findAll();
    }

}
