package com.reto.disney.backend.Service;

import com.reto.disney.backend.Repository.CharacterRepository;
import com.reto.disney.backend.model.CharacterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;


    public List<CharacterModel> findAll() {
        return characterRepository.findAll();
    }

    public CharacterModel save(CharacterModel characterModel) {
        return characterRepository.save(characterModel);
    }

    public void deleteById(Long id) {
        characterRepository.deleteById(id);
    }

    public List<CharacterModel> findByName(String name) {
        return characterRepository.findAll().stream().filter(x -> x.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
}
