package library;

public class Book{
    String bookTitle, bookAuthor, isbn, holderCPF;
    int yearPub;
    boolean available;

    Book(String bookTitle, String bookAuthor, int yearPub, String isbn){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearPub = yearPub;
        this.isbn = isbn;
        this.available = true;
        this.holderCPF = "0";
    }

    void lendBook(String holderCPF){
        if(this.available){
            this.holderCPF = holderCPF;
            this.available = false;
            System.out.printf("Livro emprestado para %s.\n",holderCPF);
        }
        else{
            System.out.println("Livro não está disponível para empréstimo.");
        }
    }

    void returnBook(){
        this.available = true;
        this.holderCPF = "0";
    }
}