//15
import java.util.Scanner;

public class averageof3Numbers {
    static Scanner scan= new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter 3 numbers ");
        int a= scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
        System.out.println("avg of 3 number = "+ avg(a,b,c));
    }
   static double avg(int a,int b,int c)
    {
        return (double)(a+b+c)/3;
    }
}
