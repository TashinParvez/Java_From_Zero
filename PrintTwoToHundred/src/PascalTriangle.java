import java.util.Scanner;

public class PascalTriangle {
    static Scanner scan = new Scanner(System.in);

    // __________________Main function_______________

    public static void main(String[] args) {
        prnt("Enter Pascal's Triangle's length: ");
        int len = scan.nextInt();
        pacleTriangle(len);
    }

    //_________________Create Triangle______________
    static void pacleTriangle(int len) {
        int[][] pacleTriangle = new int[len][len];

        // First row and First Column
        for (int i = 0; i < len; i++) {
            pacleTriangle[0][i] = 1;
            pacleTriangle[i][0] = 1;
        }

        // Other Columns and Rows
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < len; j++)
                pacleTriangle[i][j] = pacleTriangle[i][j - 1] + pacleTriangle[i - 1][j];
        }

        //___________printing_________
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i; j++)
                prnt(pacleTriangle[i][j]+"\t");
            prnt("\n\n");
        }

    }

// _______________Printing Segments_______________

    static void prnt(Object anything) {
        System.out.print(anything);
    }
}