function cortarIngredientes(ingredientes, callback){
    setTimeout(()=>{
        console.log(`cortando ${ingredientes}`)
        callback();
    }, 2000);

}

function cocinar(accion, callback){
    setTimeout(()=>{
        console.log(`cocinando ${accion}`)
        callback();
    }, 2500);

}

function servirPlato(plato){
    console.log("Listo para servir: ", plato);

}


function prepararReceta(plato, callback){
    console.log("iniciamos la preparacion de la receta.", plato);

    cortarIngredientes("vegetales", ()=>{
        cocinar("saltear", ()=>{
            cortarIngredientes("Pollo", ()=>{
                cocinar("Freir", ()=>{
                    cocinar("Mesclar", ()=>{
                        servirPlato(plato);
                        callback();
                    })
                })
            })
        })
    });

}


prepararReceta("Pollo al wok", ()=>{
    console.log("Receta completa");
});