//Declare uma variável com o valor null e outra com o valor undefined. Compare-as usando os operadores == e ===. Explique o resultado.

const exnull = null
const exunde = undefined
const resultado1 = exnull == exunde
const resultado = exnull === exunde
console.log(resultado, resultado1)
// O valor no primeiro(==) deu verdadeiro porque ele tenta transformar em string, ou seja so compara o tipo, por isso o verdadeiro. Já o segundo(===) é estritamente igual as duas variaveis tinham que ser iguais, pois ele não tenta transformar, ele realmente vê se é igual.
