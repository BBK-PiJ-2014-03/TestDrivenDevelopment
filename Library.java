import java.util.List;
import java.util.ArrayList;

public class Library {
    
    private String libraryName;;
    
    private int id = 0;

    private int maxBooksPerUser = 3;

    private List<LibraryUser> userArray = new ArrayList<LibraryUser>();
    private List<Book> bookArray = new ArrayList<Book>();
    
    
    public Library(String name) {
        this.libraryName = name;
    }
    
    public String getName() {
        return libraryName;
    }
    
    public int getTotalMembers() {
        return id;
    }

    public int getMaxBooksPerUser() {
        return maxBooksPerUser;
    }
    public void setMaxBooksPerUser(int books) {
        this.maxBooksPerUser = books;
    }
    
    public void addUser(LibraryUser libraryUser) {
        userArray.add(libraryUser);
    }
    public int setID() {
        int userID = id;
        id++;
        return userID;
    }
    
    public int getID(String userName) {
        int result = -1;
        for (LibraryUser element : userArray) {
            if (userName.equals(element.getName())) {
                result = element.getLibraryID();
            }
        }
        return result;
    }
    
    public List<LibraryUser> getUserArray() {
        return userArray;
    }
    
    public LibraryUser getElement(int element) {
        return userArray.get(element);
    }
    
    
    public void addBook(String author, String title) {
        Book newBook = new Book(author, title);
        bookArray.add(newBook);
    }
    
}