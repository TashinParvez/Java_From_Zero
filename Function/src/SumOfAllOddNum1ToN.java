//19
import java.util.Scanner;

public class SumOfAllOddNum1ToN {
    static Scanner scan= new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter a numbers ");
        int a= scan.nextInt();

        System.out.println("Sum = "+ sum(a));
    }
    static double sum(int a)
    {
        int sum=0;
        for(int i=1;i<=a;i++)
            if(i%2!=0)
                sum+=i;
        return sum;
    }
}