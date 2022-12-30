package OOP_LAB_ProblemSet.OOP_LAB_ProblemSet__B.Q_1__Book_Application;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        BOOK_Collection[] books = new BOOK_Collection[1000];
        System.out.println("Enter a char : ");
        int i = 0; // total books stored
        char c = sc.next().charAt(0);
        while (c != 'q') {
            switch (c) {
                case 'n':
                    System.out.println("How many books you want to entry? ");
                    int n = sc.nextInt();
                    int ii = i;
                    i+=n;
                    for (int j = ii; j < n + ii; j++) {
                        System.out.println("Enter" + (j - ii + 1) + " Book info ");
                        books[j] = new BOOK_Collection(sc.nextLine(), sc.nextLine(), sc.nextInt());
                    }
                    break;
                case 'd':
                    System.out.println("Which number of book you want to delete ");
                    int p = sc.nextInt();

                    // here
            }

            System.out.println("Enter a char : ");
        }
    }
}
