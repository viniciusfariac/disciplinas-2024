function adcao(num1, num2) {
    return num1 + num2;
}

function subtrair(num1, num2) {
    return num1 - num2;
}

function multiplicar(num1, num2) {
    return num1 * num2;
}

function dividir(num1, num2) {
    if (num2 === 0) {
        return "Erro: Divisão por zero";
    }
    return num1 / num2;
}

function calculadora(num1, num2, operacao) {
    switch (operacao) {
        case '+':
            return adcao(num1, num2);
        case '-':
            return subtrair(num1, num2);
        case '*':
            return multiplicar(num1, num2);
        case '/':
            return dividir(num1, num2);
        default:
            return "Operação inválida. Use: +, -, * ou /.";
    }
}


console.log(calculadora(10, 5, '+'));  
console.log(calculadora(10, 5, '-'));  
console.log(calculadora(10, 5, '*'));  
console.log(calculadora(10, 5, '/'));  
console.log(calculadora(10, 0, '/'));  
console.log(calculadora(10, 5, '%'));  
