function obtenerDatosDelServidor(){
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            let usuario = {
                nombre:"Ruben",
                edad: 24
            }

            if(usuario){
                resolve(usuario);
            }
            else{
                reject("Ocurrió un error al obtener los datos.");
            }
        }, 2000);
    }
    );
}

obtenerDatosDelServidor()
    .then((usuario) =>{
        return usuario.nombre.toUpperCase();
    })
    .then(nombreMayuscula =>{
        console.log(nombreMayuscula);
    })
    .catch((error) =>{
        console.log(error);
    })
    .finally(()=>{
        console.log("Fin del programa.");
    });


/*
fetch("https://jsonplaceholder.typicode.com/posts")
    .then( response =>{
        return response.json();
    } )
    .then(json =>{
        console.log("Lista de post: ", json)
    })
    .catch(err =>{
        console.log(err);
    })
    .finally(()=>{
        console.log("Termino la petición del servidor.");
    });

*/


async function obtenerPosts() {

    try{
        let response = await fetch("https://jsonplaceholder.typicode.com/posts");
    
        console.log(await response.json());
    }
    catch(err){
        console.log(err)
    }
    finally{
        console.log("Finalizamos de obtener los posts")
    }
}

obtenerPosts();