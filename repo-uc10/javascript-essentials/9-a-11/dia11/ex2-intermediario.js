//Implemente uma função que "achate" um array de arrays em um único nível. Por exemplo, [[1, 2], [3, 4], [5, 6]] deve se tornar [1, 2, 3, 4, 5, 6].
let arrayDeArrays = [[1, 2], [3, 4], [5, 6]]

let arrayAchatado = []

for (let i = 0; i < arrayDeArrays.length; i++) {
    for (let a = 0; a < arrayDeArrays[i].length; a++) {
        arrayAchatado.push(arrayDeArrays[i][a])
    }
}

console.log("Array achatado:", arrayAchatado)

