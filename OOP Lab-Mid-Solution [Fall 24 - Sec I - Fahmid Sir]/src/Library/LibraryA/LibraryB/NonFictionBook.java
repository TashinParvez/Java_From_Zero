package Library.LibraryA.LibraryB;

import Library.Book;

public class NonFictionBook extends Book {

    String subject;

    // --------------------------------------------------------------------------

    // Constructor
    public NonFictionBook(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    // --------------------------------------------------------------------------

    // Display info with showStatus
    @Override
    public void displayInfo(boolean showStatus) {
        super.displayInfo(showStatus);
        System.out.println("Subject: " + subject);
    }

    // --------------------------------------------------------------------------

}
