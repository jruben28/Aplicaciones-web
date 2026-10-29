package com.example.PokemonAPIRest.controller;

import com.example.PokemonAPIRest.model.Pokemon;
import com.example.PokemonAPIRest.service.PokemonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pokemons")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public List<Pokemon> listar(){

        return pokemonService.listarTodos();
    }

    @GetMapping("/{id}")
    public Pokemon buscarPorId(@PathVariable Long id){
        return pokemonService.obtenerPorId(id);
    }

    @PostMapping
    public Pokemon crear(@Valid @RequestBody Pokemon pokemon){
        return pokemonService.crearPokemon(pokemon);
    }

    @PutMapping("/{id}")
    public Pokemon actualizar(@PathVariable Long id, @RequestBody Pokemon pokemon){

        return pokemonService.actualizar(id, pokemon).orElse(null);

    }

    @PatchMapping("/{id}")
    public Pokemon actualizarParcial(@PathVariable Long id, @RequestBody Pokemon pokemon){

        return pokemonService.actualizarParcial(id, pokemon).orElse(null);

    }

    @DeleteMapping("/{id}")
    public void elimina(@PathVariable Long id){

        pokemonService.eliminarPokemon(id);

    }


}
