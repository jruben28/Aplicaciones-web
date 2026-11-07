let numeros = [1, 2, 3, 4, 5];

let dobles = numeros.map(num => `<p>Numero: ${num}</p>`);

console.log(numeros);
console.log(dobles);

const html = dobles.join("");

console.log(html);

const edad = 18;
if(edad >= 18 && edad <= 45){
    console.log("Puedes pasar")
}
else if(edad >=18 && edad > 45){
    console.log("Vayase a dormir señor")
}
else{
    console.log("No puedes pasar");
}


const dia = 3;

switch(dia){
    case 1:
        console.log("Lunes");
        break;
    case 2:
        console.log("Martes");
        break;

    case 3:
        console.log("Miercoles");
        break;
    case 4:
        console.log("Jueves");
        break;
    case 5:
        console.log("Viernes");
        break;
    case 6:
        console.log("Sabado");
        break;
    case 7:
        console.log("Domingo");
        break;
}

const alumno = {
    nombre: "Ruben",
    edad: 24,
    hobbies: ["Nada", "Nada 2", "Nada 3"],
    direccion:{
        calle: "Calle muy real",
        numero: 4332,
        lat: "",
        alt: ""
    },
    saludar: function(){
        return `hola soy ${nombre} y tengo ${edad} años de edad.`;
    }
}

console.log(alumno);
alumno.edad = 25;
console.log(alumno);


for(const llave in alumno){
    console.log(`${llave} = ${alumno[llave]}`)
}

for(const hobbie of alumno.hobbies){
    console.log(hobbie);
}


for(let i = 0; i < alumno.hobbies.length; i++){
    
}