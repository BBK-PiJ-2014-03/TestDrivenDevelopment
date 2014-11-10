public class Library {
    
    private String libraryName;;
    
    private int id = 0;

    private int maxBooksPerUser = 3;

    private ArrayList userArray = new ArrayList();
    
    public Library(String name) {
        this.libraryName = name;
    }
    
    public String getName() {
        return libraryName;
    }
    public int getID() {
        return id;
    }
    
    public int getMaxBooksPerUser() {
        return maxBooksPerUser;
    }
    
    
    
}
    /* private LibraryUser[] LibraryArray = new LibraryUser[5];
    
    private int listSize = 0;
    
    public void addUser (LibraryUser newUser) {
        if (LibraryArray[listSize] == null) {
            LibraryArray[listSize] = newUser;
        }
        else {
             */