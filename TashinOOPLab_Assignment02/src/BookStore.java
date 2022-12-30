import java.util.Scanner;

public class BookStore {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Book[] bookList = new Book[100];
        int i = 0;
        while (i<100) {
            System.out.print("Enter a char (a,q,p) to continue this program : ");
            char c = scan.next().charAt(0);
            System.out.println();
            if (c == 'a') {
                System.out.println("Enter nameOfTheBook , bookPrice, authorName, publishedDate");
                bookList[i] = new Book(scan.nextLine(), scan.nextInt(), scan.nextLine(),scan.nextLine(), scan.nextInt());
            } else if (c == 'q') {
                break;
            } else if (c == 'p') {
                if (bookList.length == 0) {
                    System.out.println("There is no book in this list");
                    System.out.println("to add book please enter a ");
                    i--;
                }
                for (int j = 0; j < bookList.length; j++) {
                    bookList[i].printBookList();
                }
            } else {
                System.out.println("Input is invalid");
                i--;
            }
            i++;
        }
    }
}