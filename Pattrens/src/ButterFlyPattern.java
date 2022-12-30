// 52
import java.util.Scanner;

public class ButterFlyPattern {
    static Scanner scan = new Scanner(System.in);
    static void firstHalfSpaces(int rowSize,int i)
    {
        for (int j = 1; j <= rowSize - i; j++)
            System.out.print("  ");
    }
    static void firstHalfStars(int i)
    {
        for (int j = 1; j <= i; j++)
            System.out.print("* ");
    }

    public static void main(String[] args) {
        System.out.print("Input Row Size: ");
        int rowSize = scan.nextInt();

        for (int i = 1; i <= rowSize; i++) {

            firstHalfStars(i);
            firstHalfSpaces(rowSize, i);
            firstHalfSpaces(rowSize, i);
            firstHalfStars(i);

            System.out.println();
        }

        // second half

        for (int i = 1; i <= rowSize; i++) {

            lastHalfStars(rowSize, i);
            lastHalfSpaces(i);
            lastHalfSpaces(i);
            lastHalfStars(rowSize, i);

            System.out.println();
        }
    }
    static void lastHalfStars(int rowSize,int i)
    {
        for (int j = 1; j <= rowSize - i + 1; j++)
            System.out.print("* ");
    }
    static void lastHalfSpaces(int i)
    {
        for (int j = 1; j <= i - 1; j++)
            System.out.print("  ");
    }

}