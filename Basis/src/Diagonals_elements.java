import java.util.Scanner;
// 35
public class Diagonals_elements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter array size : ");
        int row = scan.nextInt();
        int[][] arr = new int[row][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.print("Mejor diagonal: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j)
                    System.out.print(arr[i][j] + " ");
                ;
            }
        }
        System.out.println();

        System.out.print("Minor Diagonal: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (j == row - i - 1)
                    System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();

    }
}
