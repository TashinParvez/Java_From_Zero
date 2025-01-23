package Library.LibraryA.LibraryB;

import Library.Book;
import Library.LibraryA.FictionBook;

public class LibraryTest {
    public static void main(String[] args) {

        // --------------------------------------------------------------------------

        // Step 7a: Create a Book array
        Book[] myBooks = new Book[3];

        // --------------------------------------------------------------------------

        // Step 7b: Create 2 Fictional books and 1 Non-Fictional book
        myBooks[0] = new FictionBook("Harry Potter", "J.K. Rowling", "Fantasy");
        myBooks[1] = new FictionBook("The Hobbit", "J.R.R. Tolkien", "Adventure");
        myBooks[2] = new NonFictionBook("A Brief History of Time", "Stephen Hawking", "Science");


        // --------------------------------------------------------------------------

        // Step 7c: Call displayInfo() and displayInfo(showStatus)
        for (Book book : myBooks) {
            book.displayInfo();
            book.displayInfo(true);
            System.out.println();
        }

        // Step 7d: Use borrow() and return() on one of the books
        myBooks[0].borrow();
        myBooks[0].borrow(); // Try to borrow again
        myBooks[0].returnBook();
        myBooks[0].returnBook(); // Try to return again
    }
}
