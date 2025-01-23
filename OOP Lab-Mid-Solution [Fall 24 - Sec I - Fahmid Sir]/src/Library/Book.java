package Library;

public class Book {

    // --------------------------------------------------------------------------
    private String title;
    private String author;
    private boolean isBorrowed;
    public static final int max_books = 3;

    // --------------------------------------------------------------------------

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    // --------------------------------------------------------------------------

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // --------------------------------------------------------------------------

    // Display info (part d)
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    // --------------------------------------------------------------------------


    // Display info with status (part e)
    public void displayInfo(boolean showStatus) {
        if (showStatus) {
            System.out.println("Borrowed: " + isBorrowed);
        }
        displayInfo();
    }

    // --------------------------------------------------------------------------

    // Borrow method (part f)
    public void borrow() {
        if (!isBorrowed) {
            System.out.println("You can borrow the book.");
            isBorrowed = true;
        } else {
            System.out.println("You cannot borrow the book.");
        }
    }

    // --------------------------------------------------------------------------

    // Return method (part g)
    public void returnBook() {
        if (isBorrowed) {
            System.out.println("Returned the book.");
            isBorrowed = false;
        } else {
            System.out.println("Book is not borrowed.");
        }
    }

}

