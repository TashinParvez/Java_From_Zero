// 40
import java.util.Scanner;

public class DiamondPattern {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input Row Size: ");
        int rowSize = scan.nextInt();

        int count = 1;
        for (int i = 1; i <= rowSize; i++) {

            for (int j = 1; j <= rowSize - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= count; j++) {
                System.out.print("* ");
            }
            count += 2;
            System.out.println();
        }

        // second part

        count -= 2;

        for (int i = 1; i <= rowSize; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= count; j++) {
                System.out.print("* ");
            }

            count -= 2;
            System.out.println();
        }

    }
}