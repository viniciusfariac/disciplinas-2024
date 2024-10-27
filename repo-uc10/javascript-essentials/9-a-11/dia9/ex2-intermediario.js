//Validação de Senha Implemente um sistema que peça ao usuário para criar uma senha que atenda a certos critérios (por exemplo, pelo menos 8 caracteres, contendo letras e números).

function verificador() {
  let senha = prompt("Digite uma senha (mínimo 9 caracteres): ");

  while (senha.length < 9) {
    senha = prompt("Senha muito curta! Digite novamente (mínimo 9 caracteres): ");
  }

  alert("Senha aceita!");
}

verificador();