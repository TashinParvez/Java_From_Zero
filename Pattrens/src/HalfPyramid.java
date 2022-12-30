import java.util.Scanner;
//18

public class HalfPyramid {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input Row Size: ");
        int rowSize = scan.nextInt();

        for(int i=1;i<=rowSize;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
