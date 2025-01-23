package Library.LibraryA;

import Library.Book;

public class FictionBook extends Book {
    String genre;

    // --------------------------------------------------------------------------

    // Constructor
    public FictionBook(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    // --------------------------------------------------------------------------

    // Display info
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }

    // --------------------------------------------------------------------------

}
