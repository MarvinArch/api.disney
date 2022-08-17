package com.reto.disney.backend.Controller;

import com.reto.disney.backend.Repository.CharacterRepository;
import com.reto.disney.backend.Service.CharacterService;
import com.reto.disney.backend.model.CharacterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/characters")
public class CharacterRest {
    @Autowired
    private CharacterService characterService;
    @GetMapping("")
    public List<CharacterModel> getAll(@RequestParam (value = "name", required = false )  String name,
                                       @RequestParam (value = "age", required = false )  String age,
                                       @RequestParam (value = "movies", required = false )  String idMovie){

        return characterService.findAll();

    }
    @PostMapping("")
    public ResponseEntity<CharacterModel> newCharacter(@RequestBody CharacterModel characterModel){
        return new ResponseEntity<>(characterService.save(characterModel), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCharacter(@PathVariable Long id){
        //comprobar como eliminar personaje si ya contiene peliculas asociadas
        characterService.deleteById(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping("name={nombre}")
    public List<CharacterModel> getSearch(@PathVariable String nombre){
        return characterService.findByName(nombre);
    }
}
