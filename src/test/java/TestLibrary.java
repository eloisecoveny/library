import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    public Library library;
    public Book book;
    public Borrower borrower;

    @Before
    public void setup(){
        library = new Library();
        book = new Book("Norweigan Wood", "Haruki Murakami", "fantasy");
        borrower = new Borrower("Lily");
    }

    // Write a method to count the number of books in the library.

    @Test
    public void libraryShouldStartEmpty(){
        assertEquals(0, library.countBooks());
    }

    // Write a method to add a book to the library stock.

    @Test
    public void canAddBookToLibrary(){
        library.add(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void libraryShouldNotAcceptBookIfReachedCapacity(){
        library.add(book);
        library.add(book);
        library.add(book);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void borrowerCanCheckOutBook(){
        Book book1 = new Book("Harry Potter", "JK Rowling", "fantasy");
        Book book2 = new Book ("1Q86", "Haruki Murakami", "fantasy");
        library.add(book1);
        library.add(book2);
        library.checksOut(book2);
        assertEquals(1, library.countBooks());
    }
}