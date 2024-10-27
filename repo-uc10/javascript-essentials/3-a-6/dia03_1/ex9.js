//Demonstre a diferença de escopo entre var e let dentro de um bloco if.

var nome = "vinicius"
let sobrenome = "faria"
if(true){
    let sobrenome = "vava"
    console.log(nome)
    console.log(sobrenome)
}