//Crie uma função que receba um array de números e retorne a soma de todos os elementos pares.
let numeros = [1, 5, 6, 8, 9, 11]
let soma = 0

for(let i = 0; i < numeros.length; i++){
    if(numeros[i] % 2 === 0) {
        soma += numeros[i]
    }
}
console.log("A soma de todos os números pares é: "+soma)