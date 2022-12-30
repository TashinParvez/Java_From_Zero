import java.util.Scanner;
// 16
public class InvertedHalfPyramidWithNumbers {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input Row Size: ");
        int rowSize = scan.nextInt();

        for (int i = 1; i <= rowSize; i++) {
            for (int j = 1; j <= rowSize-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}