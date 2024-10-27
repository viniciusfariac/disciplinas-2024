//Implemente uma função que receba dois arrays e retorne um novo array com os elementos comuns entre eles.

let array1 = [1, 2, 3, 4, 5];
let array2 = [4, 5, 6, 7, 8];
let elementosComuns = []; 

for (let i = 0; i < array1.length; i++) {
    for (let a = 0; a < array2.length; a++) {

        if (array1[i] === array2[a]) {
            elementosComuns.push(array1[i]);
            break;
        }
    }
}

console.log("Elementos comuns:", elementosComuns); 