import java.util.Scanner;
// 24
import static java.lang.Math.log10;

public class ReverseOfANumber_UsingRecursion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        int digits = (int) (log10(number)) + 1;

        int Num = reverseNumber(number, digits);
        System.out.println(Num);
    }

    static int reverseNumber(int number, int digits) {
        if (number <= 0)
            return 0;
        int last = number % 10;
        return last * (int) Math.pow(10, digits - 1) + reverseNumber(number / 10, --digits);
    }
}