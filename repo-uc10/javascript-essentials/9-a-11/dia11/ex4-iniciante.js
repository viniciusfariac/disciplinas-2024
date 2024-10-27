// Crie uma função que receba um array e remova todos os elementos duplicados.

let numeros = [1, 2, 3, 2, 4, 3, 5, 1];
let numerosUnicos = []; 


for (let i = 0; i < numeros.length; i++) {

    let existe = false; 
    for (let j = 0; j < numerosUnicos.length; j++) {
        if (numeros[i] === numerosUnicos[j]) {
            existe = true; 
            break; 
        }
    }
    
    
    if (!existe) {
        numerosUnicos.push(numeros[i]);
    }
}

console.log("Array sem duplicatas:", numerosUnicos); 
