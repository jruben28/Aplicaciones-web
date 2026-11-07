function obtenerPost(callback){
    fetch('https://jsonplaceholder.typicode.com/posts/1').then(r =>{
        console.log("Termine la promesa");
        callback();
    })
    
}

const ejecutarAlTerminar = () => {
    console.log("Finalizar el programa")
}

console.log("inicia el programa")
obtenerPost(ejecutarAlTerminar);
