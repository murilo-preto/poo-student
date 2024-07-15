package library;

public class App {
    public static void main(String[] args) {
        Library biblioteca = new Library();

        Book livro1 = new Book("O Senhor dos Aneis", "Tolkien", 1954, "1");
        Book livro2 = new Book("Dom Quixote", "Cervantes", 1605, "2");

        biblioteca.addBook(livro1);
        biblioteca.addBook(livro2);

        livro1.lendBook("12345678900");
        livro2.lendBook("12312312322");
        
        biblioteca.printBooksInLibrary();
        biblioteca.printLentBooksInLibrary();


    }
}
