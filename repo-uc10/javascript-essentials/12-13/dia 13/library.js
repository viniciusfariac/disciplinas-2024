const fs = require('fs');

// Caminho para o arquivo JSON externo
const libraryFile = './library.json';

// Carregar biblioteca (se não existir, inicializa um array vazio)
function loadLibrary() {
  try {
    const data = fs.readFileSync(libraryFile, 'utf8');
    return JSON.parse(data);
  } catch (error) {
    return []; // Retorna um array vazio se o arquivo não existir
  }
}

// Salvar biblioteca no arquivo
function saveLibrary(library) {
  fs.writeFileSync(libraryFile, JSON.stringify(library, null, 2), 'utf8');
}

// Função para adicionar um novo livro
function addBook(title, author, isbn, year, genres) {
  const library = loadLibrary();
  const newBook = {
    title,
    author,
    isbn,
    year,
    genres,
    loanStatus: 'available'
  };
  
  library.push(newBook);
  saveLibrary(library);
  console.log(`Livro "${title}" adicionado com sucesso.`);
}

// Função para buscar um livro por título, autor ou ISBN
function searchBook(query) {
  const library = loadLibrary();
  
  const results = library.filter(book =>
    book.title.toLowerCase().includes(query.toLowerCase()) ||
    book.author.toLowerCase().includes(query.toLowerCase()) ||
    book.isbn === query
  );
  
  return results;
}

// Função para marcar um livro como emprestado
function loanBook(isbn) {
  updateBook(isbn, { loanStatus: 'loaned' });
}

// Função para marcar um livro como devolvido
function returnBook(isbn) {
  updateBook(isbn, { loanStatus: 'available' });
}

// Função para atualizar um livro existente
function updateBook(isbn, updatedInfo) {
  const library = loadLibrary();
  const bookIndex = library.findIndex(book => book.isbn === isbn);
  
  if (bookIndex !== -1) {
    library[bookIndex] = { ...library[bookIndex], ...updatedInfo };
    saveLibrary(library);
    console.log(`Livro com ISBN ${isbn} atualizado.`);
  } else {
    console.log(`Livro com ISBN ${isbn} não encontrado.`);
  }
}

// Função para exportar a biblioteca (retorna como string JSON formatada)
function exportLibrary() {
  const library = loadLibrary();
  return JSON.stringify(library, null, 2);
}

// Função para importar livros de uma string JSON
function importLibrary(jsonString) {
  const newBooks = JSON.parse(jsonString);
  const library = loadLibrary();
  const updatedLibrary = [...library, ...newBooks];
  saveLibrary(updatedLibrary);
  console.log('Livros importados com sucesso.');
}

// Exporta as funções para serem usadas no app.js
module.exports = {
  addBook,
  searchBook,
  loanBook,
  returnBook,
  exportLibrary,
  importLibrary,
};
