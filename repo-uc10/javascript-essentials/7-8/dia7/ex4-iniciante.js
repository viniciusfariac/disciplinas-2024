//Escreva uma função que verifica se um ano é bissexto.

let dia = 2024;
let dia1;
if( dia % 4 === 0 && dia % 100 !== 0){
    console.log("É um ano bissexto")
}
else{
    console.log("Não é um ano bissexto")
}