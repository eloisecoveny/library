import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBook {

    public Book book;

    @Before
    public void setup(){
        book = new Book("Norweigan Wood", "Haruki Murakami", "fantasy");
    }

    // Books should have title, author and genre.

    @Test
    public void bookShouldHaveTitle(){
        assertEquals("Norweigan Wood", book.getTitle());
    }

    @Test
    public void bookShouldHaveAuthor(){
        assertEquals("Haruki Murakami", book.getAuthor());
    }

    @Test
    public void bookShouldHaveGenre(){
        assertEquals("fantasy", book.getGenre());
    }
}
