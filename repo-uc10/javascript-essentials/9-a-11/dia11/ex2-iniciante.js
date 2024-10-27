//Implemente uma função que receba um array de strings e retorne um novo array com todas as strings em maiúsculas.

let strings = ["a", "b", "c"]
let stringsMaiusculas = []

for(let i = 0; i < strings.length; i++){
    stringsMaiusculas.push(strings[i].toLocaleUpperCase())
}
console.log(stringsMaiusculas)