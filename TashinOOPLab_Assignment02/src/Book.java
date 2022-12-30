public class Book {
    String nameOfTheBook;
    int bookPrice;
    String authorName;
    int publishedDate;

    Book() {
    }

    Book(String nameOfTheBook, int bookPrice,  String enter ,String authorName, int publishedDate) {
        this.nameOfTheBook = nameOfTheBook;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
        this.publishedDate = publishedDate;
    }

    void printBookList() {
        System.out.printf(nameOfTheBook);
    }

}
