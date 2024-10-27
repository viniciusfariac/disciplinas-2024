// Exercício 4: Encontrar Números Primos
// Nível: Intermediário

// Descrição:
// Escreva uma função que receba um número n como entrada e retorne um array contendo todos os números primos até n (inclusive).
// Um número primo é aquele que é divisível apenas por 1 e por ele mesmo.

// Dicas:
// - Use um loop for para verificar cada número de 2 até n.
// - Crie uma função auxiliar para verificar se um número é primo.
// - Use um array para armazenar os números primos encontrados.

// Solução:
let n = 10
let numerosPrimos = []

for (let i = 2; i <= n; i++) {
    let isPrime = true

    for (let a = 2; a * a <= i; a++) {
        if (i % a === 0) { 
            isPrime = false
            break
        }
    }

    if (isPrime) {
        numerosPrimos.push(i)
    }
}
console.log(numerosPrimos)
