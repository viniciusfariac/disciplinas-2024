//Implemente uma função que simule o comportamento do método reduce() sem usar o método nativo.

function meuReduce(array, callback, valorInicial) {
    if (array.length === 0 && valorInicial === undefined) {
        throw new Error("Não é possível reduzir um array vazio sem valor inicial.")
    }

    let acumulador = valorInicial !== undefined ? valorInicial : array[0]
    let inicio = valorInicial !== undefined ? 0 : 1

    for (let i = inicio; i < array.length; i++) {
        acumulador = callback(acumulador, array[i], i, array)
    }

    return acumulador
}

const numeros = [1, 2, 3, 4, 5];
const soma = meuReduce(numeros, (acumulador, atual) => acumulador + atual, 0)
console.log(soma)
