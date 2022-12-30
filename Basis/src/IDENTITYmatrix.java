import java.util.Scanner;
// 21
public class IDENTITYmatrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("enter array size : ");
        int row = scan.nextInt();
        int[][] arr = new int[row][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
