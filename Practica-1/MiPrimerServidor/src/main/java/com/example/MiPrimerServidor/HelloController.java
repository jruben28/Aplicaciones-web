package com.example.MiPrimerServidor;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){

        return "Hola desde mi servidor de aplicación :((((((";
    }

    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre){

        return "Hola " + nombre + " me caes muy bien ojalá pases la materia";
    }

    @PostMapping("/mensaje")
    public String recibirMensaje(@RequestBody String mensaje){

        return "Recibi el mensaje: " + mensaje;

    }
}
