// Escreva uma função que receba um array de números e retorne o maior número do array.

let numeros = [10, 25, 5, 18, 30, 15];
let maiorNumero = numeros[0]; 

for (let i = 1; i < numeros.length; i++) {

    if (numeros[i] > maiorNumero) {
        maiorNumero = numeros[i]
    }
}


console.log("O maior número é:", maiorNumero)