
import {saludar, PI, config} from "./saludo.js";

console.log(saludar("Ruben"));
console.log("Este es el valor de pi: ", PI);
console.log(config.url_api);


import Estudiante from "./Estudiante.js";
import Persona from "./Persona.js";

let estudiante = new Estudiante();

estudiante.nombre = "Ruben";
estudiante.edad = 67;
estudiante.carrera = "Software"

console.log(estudiante.saludar());
console.log(estudiante.estudiar());
console.log(estudiante.verPromedio());

let persona = new Persona("Ruben", 24);

console.log(persona.saludar());