/**
*
*   Class holding information about a user of a Library
*
*/

public class LibraryUser {
    
    private final String name;
    private int libraryID;
    
    private Library userLibrary;
    
    /**
    *
    *   Constructor for building LibraryUser Objects
    *
    *   @param String name the name of the LibraryUser
    *   @param int libraryID the libraryID of the LibraryUser
    *
    */
    public LibraryUser(String name) {
        this.name = name;
    }
    
    /**
    *
    *   getter method returns the name of the LibraryUser
    *
    */
    public String getName() {
        return name;
    }
    /**
    *
    *   getter method returns the libraryID of the LibraryUser
    *
    */
    public int getLibraryID() {
        return libraryID;
    }
    
    /**
    *
    *   setter method sets the libraryID of the LibraryUser
    *
    */
    private void setLibraryID(int libraryID) {
        this.libraryID = libraryID;
    }
    
    public void register(Library library) {
        this.setLibraryID(library.setID());
        library.addUser(this);
        this.userLibrary = library;
        
    }
    public String getLibrary() {
        return userLibrary.getName();
    }
    
    public String toString() {
        String newString = "Name: " + name + "\nLibraryID: " + libraryID;
        return newString;
    }
}