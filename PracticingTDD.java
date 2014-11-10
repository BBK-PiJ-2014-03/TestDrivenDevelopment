import org.junit.*;
import static org.junit.Assert.*;

public class PracticingTDD {
    
    Book newBook;
    LibraryUser newUser;
    Library newLibrary;
    
    /*
    *
    *   Testing the Book Class
    *
    */
    
    @Before
    public void buildBook() {
        newBook = new Book("Jim Smith", "My Book");
    }
    @Test
    public void testBookConstructor() {
        assertNotNull(newBook);
        System.out.println(newBook.getAuthor() + "\n" + newBook.getTitle());
    }
    @Test
    public void testBookGetters() {
        Book newBook = new Book("Jim Smith", "My Book");
        
        String title = newBook.getTitle();
        String author = newBook.getAuthor();
        
        assertEquals(author, "Jim Smith");
        assertEquals(title, "My Book");
        System.out.println(newBook.getAuthor() + "\n" + newBook.getTitle());
    }
    @After
    public void cleanBook() {
        newBook = null;
    }
    
    /*
    *
    *   Testing the LibraryUser Class
    *
    */
    @Before
    public void buildUser() {
        newUser = new LibraryUser("Jim Smith");
        Library testLibrary = new Library("BBK-Library");
        newUser.register(testLibrary);
    }
    
    @Test
    public void testLibraryUserConstructor() {
        assertNotNull(newUser);
        System.out.println(newUser.getName() + "\n" + newUser.getLibraryID());
    }
    
    @Test
    public void testLibraryUserGetters() {
        assertEquals(newUser.getName(), "Jim Smith");
        assertEquals(newUser.getLibraryID(), 13);
    }
    
    @After
    public void cleanUser() {
        newUser = null;
    }
    
    @Before
    public void buildLibrary() {
        newLibrary = new Library("BBK-Library");
    }
    
    @Test
    public void testLibraryConstructor() {
        assertNotNull(newLibrary);
    }
    @Test
    public void testLibraryGetters() {
        assertEquals(newLibrary.getName(), "BBK-Library");
        assertEquals(newLibrary.getID(), 13);
    }
    
    @Test
    public void testMaxBooksPerUser() {
        assertEquals(newLibrary.getMaxBooksPerUser(), 3);
    }
    
    @After
    public void cleanLibrary() {
        newLibrary = null;
    }
}