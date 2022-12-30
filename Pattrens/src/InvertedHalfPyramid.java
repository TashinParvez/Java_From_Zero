// 15
import java.util.Scanner;

public class InvertedHalfPyramid {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input Row Size: ");
        int rowSize = scan.nextInt();

        for (int i = 1; i <= rowSize; i++) {
            for (int j = 1; j <= rowSize-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

