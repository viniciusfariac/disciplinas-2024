let biblioteca = {
    livros: [],

    adicionarLivro: function(titulo, autor, anoPublicacao) {
        this.livros.push({ titulo, autor, anoPublicacao });
    },

    buscarPorAutor: function(autorBuscado) {
        return this.livros.filter(livro => livro.autor === autorBuscado);
    }
};

biblioteca.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
biblioteca.adicionarLivro("1984", "George Orwell", 1949);
biblioteca.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);

console.log(biblioteca.buscarPorAutor("George Orwell"));
