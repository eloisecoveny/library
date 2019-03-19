import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public int countBooks(){
        return this.collection.size();
    }

    public void takesOut(Library library, Book book){
        Book newBook = library.checksOut(book);
        this.collection.add(newBook);
    }
}
