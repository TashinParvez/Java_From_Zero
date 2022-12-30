import java.util.Scanner;

public class HollowInvertedPyramidStarPattern {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter total lines ");
        int line = scan.nextInt();
        for (int i = 1; i <= line; i++) {
            // printing spaces
            for (int j = 1; j < i; j++)
                System.out.print(' ');

            // printing Stars
            for (int j = 1; j <= ((line * 2) - i + 1); j++) {
                if (j == 1 || i == 1 || j == ((line * 2) - 2 * i + 1))
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
