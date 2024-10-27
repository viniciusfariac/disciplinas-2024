// Crie uma função que ordene um array de objetos com base em uma propriedade específica. Por exemplo, ordenar um array de pessoas pela idade.

let pessoas = [
    { nome: "Ana", idade: 25 },
    { nome: "Carlos", idade: 20 },
    { nome: "Beatriz", idade: 30 },
    { nome: "Daniel", idade: 22 }
];

for (let i = 0; i < pessoas.length - 1; i++) {
    for (let a = 0; a < pessoas.length - 1 - i; a++) {
        if (pessoas[a].idade > pessoas[a + 1].idade) {
            let temp = pessoas[a]
            pessoas[a] = pessoas[a + 1]
            pessoas[a + 1] = temp
        }
    }
}

// Exibe o array ordenado
console.log("Pessoas ordenadas pela idade:", pessoas)