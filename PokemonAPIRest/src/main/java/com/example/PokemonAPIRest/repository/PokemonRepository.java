package com.example.PokemonAPIRest.repository;

import com.example.PokemonAPIRest.model.Pokemon;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {


    boolean existByNombreIgnoreCase(@NotBlank(message = "El nombre no puede ser vacio") @Size(min = 2, max = 50, message = "El nombre debe de tener entre 2 y 50 caracteres") String nombre);
}
