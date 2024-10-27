// Exercício 1: Contador de Vogais
// Nível: Iniciante

// Descrição:
// Escreva uma função que receba uma string como entrada e retorne o número de vogais na string.
// Considere as vogais como 'a', 'e', 'i', 'o', 'u' (maiúsculas ou minúsculas).

// Dicas:
// - Use um loop for...of para iterar sobre cada caractere da string.
// - Converta cada caractere para minúsculo antes de verificar se é uma vogal.
// - Use um conjunto (Set) para armazenar as vogais e facilitar a verificação.

// Solução:
let str = "Hello World";

const vogais = new Set(['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']);
let contador = 0;


for (let char of str) {
    if (vogais.has(char.toLowerCase())) {
        contador++; 
    }
}

console.log("Número de vogais:", contador); 
