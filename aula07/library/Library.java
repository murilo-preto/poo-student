package library;
import java.util.ArrayList;

public class Library {
    ArrayList<Book> index;

    Library(){
        index = new ArrayList<Book>();
    }

    void addBook(Book newBook){
        this.index.add(newBook);
    }

    boolean removeBook(String toRemoveISBN){
        for (Book book : this.index){
            if (toRemoveISBN.equals(book.isbn)){
                this.index.remove(book);

                return true;
            }
        }
        return false;
    }

    Book[] lentIndex(){
        Book[] lentIndex = new Book[this.index.size()];
        int counter = 0;

        for (Book book : index){
            if(book.available == false){
                lentIndex[counter] = book;
                counter++;
            }
        }
        return lentIndex;
    }

    void printBooksInLibrary(){
        System.out.println(" < Livros na biblioteca >");
        int counter = 1;
        for (Book book : this.index){
            System.out.printf("%d. ",counter);
            System.out.println(book.bookTitle);
            counter++;
        }
        System.out.println("-----------------------");
    }
    
    void printLentBooksInLibrary(){
        System.out.println(" < Livros emprestados >");
        int counter = 1;
        var lentList = this.lentIndex();
        for (int i=0;i<lentList.length;i++){
            System.out.printf("%d. ",counter);
            System.out.println(lentList[i].bookTitle);
            counter++;
        }
        System.out.println("-----------------------");
    }
    
}
