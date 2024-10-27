// Exercício 2: Soma de Números Pares
// Nível: Iniciante

// Descrição:
// Escreva uma função que receba um número n como entrada e retorne a soma de todos os números pares de 2 até n (inclusive).

// Dicas:
// - Use um loop for tradicional.
// - Verifique se cada número é par usando o operador módulo (%).
// - Acumule a soma em uma variável.

// Solução: 
let n = 10
let soma = 0

for(let i = 2; i <= n; i++){
    if(i % 2 === 0){
        soma += i
    }
}
console.log("A soma de todos os números pares ate " +n, " é: " +soma)