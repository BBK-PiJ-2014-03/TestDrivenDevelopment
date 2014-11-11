import java.util.List;
import java.util.ArrayList;
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
        assertEquals(newUser.getLibraryID(), 0);
    }
    
    @After
    public void cleanUser() {
        newUser = null;
    }
    
    /*
    *
    *   Test building a library Library
    *
    */
    
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
    }
    
    @Test
    public void testMaxBooksPerUser() {
        assertEquals(newLibrary.getMaxBooksPerUser(), 3);
    }
    
    @After
    public void cleanLibrary() {
        newLibrary = null;
    }
    
    @Before
    public void buildMultipleUsers() {
        newLibrary = new Library("MultiUserLibrary");
        
        LibraryUser first = new LibraryUser("Jim");
        LibraryUser second = new LibraryUser("Roger");
        LibraryUser third = new LibraryUser("Sam");
        LibraryUser fourth = new LibraryUser("Charles");
        LibraryUser fifth = new LibraryUser("Owen");
        
        first.register(newLibrary);
        second.register(newLibrary);
        third.register(newLibrary);
        fourth.register(newLibrary);
        fifth.register(newLibrary);
    }
    
    @Test
    public void testAddFirstMember() {
        LibraryUser first = new LibraryUser("Pete");
        newLibrary.addUser(first);
        assertNotNull(newLibrary.getElement(0));
    }
    
    @Test
    public void testAddMembers() {
        
        int index = 0;
        for (LibraryUser user : newLibrary.getUserArray()) {
            assertNotNull(newLibrary.getElement(index));
            index++;
        }
    }
    
    @Test
    public void testGetID() {
        int index = 0;
        for (LibraryUser user : newLibrary.getUserArray()) {
            System.out.println(newLibrary.getID(user.getName()));
            assertEquals(newLibrary.getID(user.getName()), index);
            index++;
        }
    }
    
    @After
    public void cleanMultipleUsers() {
        newLibrary = null;
    }
}