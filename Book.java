/**
*
*   Class for holding information about a Book
*
*/

public class Book {

    private final String AUTHOR;
    private final String TITLE;
    /**
    *
    *   Constructor sets the AUTHOR and TITLE fields
    *
    *   @param author the AUTHOR of the Book
    *   @param title the TITLE of the Book
    *
    */
    public Book(String author, String title) {
        this.AUTHOR = author;
        this.TITLE = title;
    }
    
    /**
    *
    *   getter method to return the Book AUTHOR
    *
    */
    public String getAuthor() {
        return this.AUTHOR;
    }
    
    /**
    *
    *   getter method to return the Book TITLE
    *
    */
    public String getTitle() {
        return this.TITLE;
    }
}