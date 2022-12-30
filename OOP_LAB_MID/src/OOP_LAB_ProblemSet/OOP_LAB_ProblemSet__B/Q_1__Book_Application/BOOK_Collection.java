package OOP_LAB_ProblemSet.OOP_LAB_ProblemSet__B.Q_1__Book_Application;

public class BOOK_Collection {
    private String name;
    private String authorName;
    private int publishedYear;

    BOOK_Collection() {

    }

    BOOK_Collection(String name, String authorName, int publishedYear) {
        this.authorName = authorName;
        this.name = name;
        this.publishedYear = publishedYear;
    }

}
