const prompt = require('readline-sync');
const {
  addBook,
  searchBook,
  loanBook,
  returnBook,
  exportLibrary,
  importLibrary
} = require('./library');

// Menu de opções
const promptOptions = `
Bem-vindo ao Sistema de Gerenciamento de Biblioteca!
Escolha uma opção:
1 - Adicionar um novo livro 
2 - Buscar livros por título, autor ou ISBN
3 - Marcar livro como emprestado
4 - Marcar livro como devolvido
5 - Exportar biblioteca (JSON)
6 - Importar livros de um JSON
0 - Sair
`;

// Função principal que exibe o menu e gerencia as opções
function mainMenu() {
  let option;
  
  do {
    console.log(promptOptions);
    option = prompt.questionInt('Digite sua escolha: ');

    switch (option) {
      case 1:
        // Adicionar um novo livro
        const title = prompt.question('Qual é o título do livro? ');
        const author = prompt.question('Qual é o autor do livro? ');
        const isbn = prompt.question('Digite o ISBN do livro: ');
        const year = prompt.questionInt('Digite o ano de publicação: ');
        const genres = prompt.question('Digite os gêneros (separados por vírgula): ').split(',').map(genre => genre.trim());
        addBook(title, author, isbn, year, genres);
        break;

      case 2:
        // Buscar livros por título, autor ou ISBN
        const query = prompt.question('Digite o título, autor ou ISBN para buscar: ');
        const results = searchBook(query);
        if (results.length > 0) {
          console.log('Resultados encontrados:');
          results.forEach(book => console.log(`- ${book.title}, Autor: ${book.author}, ISBN: ${book.isbn}`));
        } else {
          console.log('Nenhum livro encontrado.');
        }
        break;

      case 3:
        // Marcar livro como emprestado
        const isbnLoan = prompt.question('Digite o ISBN do livro para marcar como emprestado: ');
        loanBook(isbnLoan);
        break;

      case 4:
        // Marcar livro como devolvido
        const isbnReturn = prompt.question('Digite o ISBN do livro para marcar como devolvido: ');
        returnBook(isbnReturn);
        break;

      case 5:
        // Exportar biblioteca (JSON)
        const exportedData = exportLibrary();
        console.log('Exportando biblioteca:');
        console.log(exportedData);
        break;

      case 6:
        // Importar livros de um JSON
        const jsonString = prompt.question('Digite a string JSON para importar livros: ');
        importLibrary(jsonString);
        break;

      case 0:
        console.log('Saindo...');
        break;

      default:
        console.log('Opção inválida, tente novamente.');
    }
  } while (option !== 0);
}

// Iniciar o sistema
mainMenu();
