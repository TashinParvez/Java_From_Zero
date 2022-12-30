package OOP_MID_Spring_22;

public class QUESTION_NO_03_B_no_Test {
    public static void main(String[] args) {
        Book book1;
        paperBackBooks book2;
        book1 = new Book();
        book2 = new paperBackBooks();

        book1.description();
        book2.description();
        book2.putPagemarks(50);

    }
}


//____________________________________________ BOOK CLASS
class Book {
    void description() {
        System.out.println("Books Are awesome");
    }

}


//__________________________________________ paperBackBooks CLASS
class paperBackBooks extends Book {
    void description() {
        System.out.println("paperBackBooks Are good for your eyes");
    }

    void putPagemarks(int pageNo) {
        System.out.println("Page marker was put on your page " + pageNo);
    }

}
