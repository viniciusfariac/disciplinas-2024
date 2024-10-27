//Crie uma função que agrupe os elementos de um array com base em uma função de agrupamento. Por exemplo, agrupar números por paridade.

let numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

let grupos = {
    pares: [],
    impares: []
};

for (let i = 0; i < numeros.length; i++) {
    if (numeros[i] % 2 === 0) {
        grupos.pares.push(numeros[i])
    } else {
        grupos.impares.push(numeros[i])
    }
}

console.log("Números Pares:", grupos.pares)
console.log("Números Ímpares:", grupos.impares)
