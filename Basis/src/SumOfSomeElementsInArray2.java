import java.util.Scanner;

// 48
public class SumOfSomeElementsInArray2 {
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

                if (i == (row / 2) + 1)
                    sum += arr[i][j];

                else if (i == 0) {
                    if (j <= (row / 2) + 1 || j == row - 1)
                        sum += arr[i][j];

                } else if (i == row - 1) {
                    if (j >= (row / 2) + 1 || j == 0)
                        sum += arr[i][j];

                } else if (i <= row / 2) {
                    if (j == (row / 2) + 1 || j == row - 1) {
                        sum += arr[i][j];
                    }

                } else if (i >= row / 2)
                    if (j == (row / 2) + 1 || j == 0)
                        sum += arr[i][j];
            }
        }

        System.out.println("sum = " + sum);
    }
}