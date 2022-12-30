import java.util.Scanner;
// 27
public class PalindromicPattern {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input Row Size: ");
        int rowSize = scan.nextInt();

        for (int i = 1; i <= rowSize; i++) {

            for (int j = 1; j <= rowSize - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            if (i > 1) {
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}