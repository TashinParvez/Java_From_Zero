public class Book {
    String bookName;
    int bookPrice;
    String authorName;
    String publicationName;
    int bookCode = 1000;

    Book(String name, String authorName, String publicationName, int bookPrice) {
        this.bookName = name;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
        this.publicationName = publicationName;
    }

    void printBookList() {
        System.out.println(this.bookCode + " Book Name: " + this.bookName + " Author: " + this.authorName + " Publication: " + this.publicationName + " Price: " + this.bookPrice + "TK");
    }

}
