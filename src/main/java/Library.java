import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(){
        this.books = new ArrayList<Book>();
        this.capacity = 2;
    }

    public int countBooks(){
        return this.books.size();
    }

    public void add(Book book){
        if(this.countBooks() < this.capacity){
            this.books.add(book);
        }
    }

    public Book checksOut(Book book){
        int index = this.books.indexOf(book);
        return this.books.remove(index);
    }
}
