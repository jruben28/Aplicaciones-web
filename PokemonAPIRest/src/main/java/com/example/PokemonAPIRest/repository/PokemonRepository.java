package com.example.PokemonAPIRest.repository;

import com.example.PokemonAPIRest.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {


}
