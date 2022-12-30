import java.util.Objects;
import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        easyPrintln("__________WELCOME TO THE WORLD OF KNOWLEDGE______");
        easyPrintln("Which Book DO You Want?");
        String bookName = scan.nextLine();
        int index = booksInStore(bookName);

        if (index>0) {
            easyPrintln("What is your profession?");
            String profession = scan.nextLine();

            if (Objects.equals(profession.toLowerCase(), "student"))
                easyPrintln("You will get 50% discount");
            else if (Objects.equals(profession.toLowerCase(), "teacher"))
                easyPrintln("You will get 40% discount");
            else
                easyPrintln("You will get 20% discount");

        } else {
            easyPrintln("Sorry this book is not available");
        }


    }

    static int booksInStore(String book) {
        String[] booksCollection = {"C", "Java", "Python", "Jquery", "DSA", "DBSM"};
        for (int i = 0; i<6 ; i++) {  // hard_code
            if (Objects.equals(book.toLowerCase(), booksCollection[i].toLowerCase()))
                return i + 1;
        }
        return 0;
    }

    static Scanner scan = new Scanner(System.in);

    public static void easyPrintln(Object anything) {
        System.out.println(anything);
    }

    public static void easyPrint(Object anything) {
        System.out.println(anything);
    }
}
