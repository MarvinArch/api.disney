package com.reto.disney.backend.Controller;

import com.reto.disney.backend.Service.GenreService;
import com.reto.disney.backend.model.CharacterModel;
import com.reto.disney.backend.model.GenreModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreRest {
    @Autowired
    private GenreService genreService;

    @GetMapping("")
    public List<GenreModel> getAll(){
        return genreService.findAll();
    }

    @PostMapping("")
    public ResponseEntity<GenreModel> newGenre(@RequestBody GenreModel genreModel){
        return new ResponseEntity<>(genreService.save(genreModel), HttpStatus.CREATED);
    }
}
