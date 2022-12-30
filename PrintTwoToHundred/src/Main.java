import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n=0;
        Scanner sc=new Scanner(System.in);

        while(n<=100)
        {
            System.out.print("Enter a Number: ");
           n+=sc.nextInt();
        }
        System.out.println("DONE");
    }
}