// 18 lines

import java.util.Scanner;

public class HollowRactangle {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Row Size : ");
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == 1 || i == row)
                    System.out.print("* ");
                else {
                    if (j == 1 || j == row)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
