// Implemente uma calculadora simples que realiza operações básicas (+, -, *, /) entre dois números.

let num1 = 1
let num2 = 3
let ope = ""
let resultado;

if(ope === "+"){
    resultado = num1 + num2
    console.log(resultado)
}
else if(ope === "-"){
    resultado = num1 - num2
    console.log(resultado)
}
else if(ope === "/"){
    resultado = num1 / num2
    console.log(resultado)
}
else if(ope === "*"){
    resultado = num1 * num2
    console.log(resultado)
}
else{
    console.log("digite algo valido")
}