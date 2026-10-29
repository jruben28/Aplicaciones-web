package com.example.PokemonAPIRest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDate;

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

    @NotBlank(message = "El nombre no puede ser vacio")
    @Size(min = 2, max = 50, message = "El nombre debe de tener entre 2 y 50 caracteres")
    private String nombre;

    @NotBlank(message = "El tipo no puede ser vacio")
    private String tipo;

    @NotNull(message = "El nivel no puede ser nulo")
    @Min(value = 1, message = "El nivel minimo debe ser 1")
    @Max(value = 100, message = "El nivel maximo debe ser 100")
    private Double nivel;

    @Min(value = 1, message = "El ataque minimo es 1")
    private Double ataque;

    @Min(value = 0, message = "La defensa no debe ser negativa")
    private Double defensa;

    @Size(max = 255, message = "La longitud de la descripcion no puede exceder los 255 caracteres")
    private String descripcion;

    @URL(message = "La imagen debe de ser una URL")
    private String imagenUrl;

    @Email(message = "El corroe debe de tener un formato válido")
    private String correoEntrenador;

    @PastOrPresent(message = "La fecha de nacimiento no puede ser mayor a la actual")
    private LocalDate fechaNacimiento;

    @Positive(message = "El peso del pokemon debe ser mayor a 0")
    private Double peso;

    @Pattern(regexp = "^\\\\d{10}$", message = "El formato no es valido")
    private String telefonoEntrenador;

    @AssertTrue(message = "El pokemon debe estar sano")
    private boolean estaSano;

}
