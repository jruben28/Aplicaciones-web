package com.example.PokemonAPIRest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "pokemons")
public class Pokemon {
    //id, nombre, tipo, nivel, ataque, defensa, descripcion y imagenUrl

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String tipo;

    @Column
    private Double nivel;

    @Column
    private Double ataque;

    @Column
    private Double defensa;

    @Column
    private String descripcion;

    @Column(name = "imagen_url")
    private String imagenUrl;


}
