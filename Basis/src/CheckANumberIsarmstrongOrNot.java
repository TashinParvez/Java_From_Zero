import java.util.Scanner;
// 32
import static java.lang.Math.log10;

public class CheckANumberIsarmstrongOrNot {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        checkarmstrong(number);

    }

    static void checkarmstrong(int number) {
        int sum = 0;
        int totalDigits = (int) (log10(number) + 1);
        int num = number;
        int lastDigit = 0;
        while (num > 0) {
            lastDigit = num % 10;
            sum += Math.pow(lastDigit, totalDigits);
            num /= 10;
        }
        if (sum == number)
            System.out.println(number + " Yes its a armstrong number");
        else
            System.out.println(number + " No its not a armstrong number");
    }
}