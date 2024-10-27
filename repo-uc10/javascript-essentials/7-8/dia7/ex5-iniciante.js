//Crie um programa que classifica um triângulo como equilátero, isósceles ou escaleno com base no comprimento de seus lados.
let lado1 = 1
let lado2 = 2
let lado3 = 3

if(lado1 === lado2 && lado2 === lado3 ){
    console.log("É um triangulo equilatero")
}
else if(lado1 === lado2 || lado1 === lado3 || lado2 === lado3){
    console.log("é um trinagulo isosceles")
}
else{
    console.log("É um trinagulo escaleno")
}