// Crie uma função que verifica se uma string é um palíndromo.

function isPalindromo(str) {

    const normalizedStr = str.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();

    
    const reversedStr = normalizedStr.split('').reverse().join('');

  
    return normalizedStr === reversedStr;
}


console.log(isPalindromo("arara")); 
console.log(isPalindromo("A man, a plan, a canal, Panama")); 
console.log(isPalindromo("hello")); 