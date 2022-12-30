//20
import java.util.Scanner;

public class FindLargeNumber {
    static Scanner scan= new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers ");
        int a= scan.nextInt();
        int b= scan.nextInt();

        System.out.println("Large num = "+ largeNumber(a,b));
    }
    static int largeNumber(int a,int b)
    {
       if(a>=b)
        return a;
       else
           return b;

    }
}