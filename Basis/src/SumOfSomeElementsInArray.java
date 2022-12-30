import java.util.Scanner;
// 32
public class SumOfSomeElementsInArray {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("enter array size : ");
        int row = scan.nextInt();
        int[][] arr = new int[row][row];

        // scan inputs
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        // for sum
        int sum = 0;
        System.out.print("Mejor diagonal: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == 1 || i == row - 1)
                    sum += arr[i][j];
                else if (j == i || j == row - i)
                    sum += arr[i][j];
            }
        }

        System.out.println("sum = " + sum);
    }
}
