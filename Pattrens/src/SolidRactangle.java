// 18 lines

import java.util.Scanner;
// 20
public class SolidRactangle {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input Row Size: ");
        int rowSize = scan.nextInt();

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}