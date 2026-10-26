package com.example.PokemonAPIRest.service;

import com.example.PokemonAPIRest.model.Pokemon;
import com.example.PokemonAPIRest.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    /*
    *
    Crea los métodos para interactuar con la base de datos:
    Obtener todos: Retorna la lista de todos los Pokémon.
    Obtener por ID: Busca y retorna un Pokémon específico.
    Crear: Guardar un nuevo Pokémon en la base de datos.
    Actualizar completo (PUT): Busca el Pokémon por ID y reemplaza todos sus atributos por los nuevos recibidos.
    Actualizar parcial (PATCH): Busca el Pokémon por ID, revisa qué atributos individuales se enviaron y actualiza solamente esos (ej. si solo subió de nivel).
    Eliminar: Borra un Pokémon por su ID.
    *
    * */


    public List<Pokemon> listarTodos(){

        return pokemonRepository.findAll();
    }

    public Pokemon obtenerPorId(Long id){
        return pokemonRepository.findById(id).orElse(null);
    }

    public Pokemon crearPokemon(Pokemon pokemon){
        return pokemonRepository.save(pokemon);
    }

    public Optional<Pokemon> actualizar(Long id, Pokemon pokemon){
        return pokemonRepository.findById(id).map(
            pokemonExistente -> {
                pokemonExistente.setNombre(pokemon.getNombre());
                pokemonExistente.setTipo(pokemon.getTipo());
                pokemonExistente.setNivel(pokemon.getNivel());
                pokemonExistente.setAtaque(pokemon.getAtaque());
                pokemonExistente.setDefensa(pokemon.getDefensa());
                pokemonExistente.setDescripcion(pokemon.getDescripcion());
                pokemonExistente.setImagenUrl(pokemon.getImagenUrl());

                return pokemonRepository.save(pokemonExistente);
            }
        );
    }

    public Optional<Pokemon> actualizarParcial(Long id, Pokemon pokemon){
        return pokemonRepository.findById(id).map(
                pokemonExistente -> {
                    if(pokemon.getNombre() != null) pokemonExistente.setNombre(pokemon.getNombre());
                    if(pokemon.getTipo() != null) pokemonExistente.setTipo(pokemon.getTipo());
                    if(pokemon.getNivel() != null) pokemonExistente.setNivel(pokemon.getNivel());
                    if(pokemon.getAtaque() != null) pokemonExistente.setAtaque(pokemon.getAtaque());
                    if(pokemon.getDefensa() != null) pokemonExistente.setDefensa(pokemon.getDefensa());
                    if(pokemon.getDescripcion() != null) pokemonExistente.setDescripcion(pokemon.getDescripcion());
                    if(pokemon.getImagenUrl() != null) pokemonExistente.setImagenUrl(pokemon.getImagenUrl());

                    return pokemonRepository.save(pokemonExistente);
                }
        );
    }

    public void eliminarPokemon(Long id){
        this.pokemonRepository.deleteById(id);
    }

}
