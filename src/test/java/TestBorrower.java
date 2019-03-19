import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBorrower {

    public Borrower borrower;
    public Book book;
    public Library library;

    @Before
    public void setup(){
       borrower = new Borrower("Lily");
       book = new Book ("Norweigan Wood", "Haruki Murakami", "fantasy");
       library = new Library();
    }

    @Test
    public void startsWithEmptyCollection(){
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canTakeBookOutFromLibrary(){
        library.add(book);
        borrower.takesOut(library, book);
        assertEquals(1, borrower.countBooks());
    }
}

// Add a third class which interacts with the other two. E.g. you could add a Borrower with a method that takes a Book and moves to the Borrower's collection.