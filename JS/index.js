let x = 10

if(x){
    console.log("Hola mundo cruel")
    console.log("Esto es un numero: ", x, " tipo: ", typeof x)
    x = "ola"
    console.log("Esto ahora es un texto: ", x, " tipo: ", typeof x)
} else{
    console.log("esternocleidomastoideo")
}



//comentario

/*
    Bloque de comentario
*/


function suma(a, b){
    return a + b;
}

console.log("el resultado de la suma es: ", suma(10, 5))

const resta = function(a, b){ return a - b} 

console.log("El resultado de la resta es: ", resta(10, 5))


const multiplicar = (a, b) => {return a * b}

console.log("El resultado de la multiplicacion es: ", multiplicar(10, 5))



//Funciones IIFE 

;(async function(){
    console.log("Hola desde la funcion que se ejecuta solita")
})()

let arreglo = [1, 2, 3, 4, 5];

console.log("arreglo original: ", arreglo);

arreglo.push(6);

console.log("arreglo después del push: ", arreglo);

arreglo.pop();

console.log("arreglo después del pop: ", arreglo);

arreglo.unshift(0)

console.log("arreglo después del unshift: ", arreglo);

arreglo.shift();

console.log("Arreglo después del shift: ", arreglo);


console.log("longitud del arreglo: ", arreglo.length);

console.log(arreglo.indexOf(3));

console.log("El arreglo tiene 3?: ", arreglo.includes(3));

console.log("Elementos unidos con un guion: ", arreglo.join("-"));


const copia = arreglo.map((e)=> "Hola " + e)

console.log(copia)