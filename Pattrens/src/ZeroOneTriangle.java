import java.util.Scanner;
// 29
public class ZeroOneTriangle {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input Row Size: ");
        int rowSize = scan.nextInt();
        int flag = 0;

        for (int i = 1; i <= rowSize; i++) {
            //   i%2==0 ? flag=0 : flag=1;  ( Check it out from sir )

            if (i % 2 == 0)
                flag = 0;
            else
                flag = 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(flag + " ");
                if (flag == 1)
                    flag = 0;
                else
                    flag = 1;
            }
            System.out.println();
        }
    }
}