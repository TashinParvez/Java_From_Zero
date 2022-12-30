import java.util.Scanner;

public class BookStore {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int capacityOftheList = 999;
        Book[] bookNo = new Book[capacityOftheList];

        int i = 0;
        while (i < capacityOftheList) {
            System.out.println("Enter a Character to continue this Program : ");

            if (i == 0) {
                System.out.println("a For Add books in the list");
                System.out.println("P For Print the book List");
                System.out.println("q For quit this program \n");
            }

            char c = scan.next().charAt(0);
            scan.nextLine();

            if (c == 'a') {
                System.out.println("Enter Book name, Author Name, Publication Name, Price");

                bookNo[i] = new Book(scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextInt());
                bookNo[i].bookCode += i + 1;
                i++;

            } else if (c == 'q') {
                break;
            } else if (c == 'p') {
                System.out.println("\nPrinting Book list : ");
                for (int j = 0; j < i; j++) {
                    bookNo[j].printBookList();
                }
            } else {
                System.out.println("Please choose a valid option");
            }

        }
    }
}