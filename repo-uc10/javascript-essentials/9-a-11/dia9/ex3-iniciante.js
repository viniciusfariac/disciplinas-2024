//Tabuada Crie um programa que imprima a tabuada de um número fornecido pelo usuário.
const num = parseInt(prompt("Digite um número: "));
function tabuada(num) {
    for (let i = 1; i <= 10; i++) {
      console.log(`${num} x ${i} = ${num * i}`);
    }
  }
  
tabuada(num);
