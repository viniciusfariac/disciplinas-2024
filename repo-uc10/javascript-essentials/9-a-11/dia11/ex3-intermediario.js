//Escreva uma função que implemente o algoritmo de busca binária em um array ordenado.

let arrayOrdenado = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]

let elementoBuscado = 7

let limiteInferior = 0
let limiteSuperior = arrayOrdenado.length - 1

let encontrado = false;

while (limiteInferior <= limiteSuperior) {
    let meio = Math.floor((limiteInferior + limiteSuperior) / 2)
    
    if (arrayOrdenado[meio] === elementoBuscado) {
        encontrado = true;
        console.log("Elemento encontrado no índice:", meio)
        break; 
    }
    else if (elementoBuscado < arrayOrdenado[meio]) {
        limiteSuperior = meio - 1
    }
    else {
        limiteInferior = meio + 1
    }
}

if (!encontrado) {
    console.log("Elemento não encontrado.")
}