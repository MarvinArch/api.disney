package com.reto.disney.backend.Repository;

import com.reto.disney.backend.model.CharacterMovieModel;
import com.reto.disney.backend.model.MovieSeriesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterMovieRepository extends JpaRepository<CharacterMovieModel, Long> {
}
