import java.util.Scanner;
//20
public class ReverseANumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        int sum=0;
        while(number>0)
        {
            sum= sum*10 + number%10;
            number/=10;
        }

        System.out.println("Reverse "+sum);

    }
}