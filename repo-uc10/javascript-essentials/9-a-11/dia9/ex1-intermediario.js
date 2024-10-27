//Sequência de Fibonacci Crie um programa que gere os primeiros 20 números da sequência de Fibonacci usando um loop while.
let x = 2;
let y = 4;
let contador = 0;

console.log(x);
console.log(y);

while (contador < 18) {
  let z = x + y;
  console.log(z);
  x = y;
  y = z;
  contador++;
}