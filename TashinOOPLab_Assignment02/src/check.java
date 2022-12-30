import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book1 = new Book(sc.nextLine(),sc.nextInt(),sc.nextLine(),sc.nextLine(),sc.nextInt());

        book1.printBookList();
    }
}
