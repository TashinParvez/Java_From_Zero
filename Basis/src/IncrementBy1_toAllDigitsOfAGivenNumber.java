import java.util.Scanner;
// 30
import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class IncrementBy1_toAllDigitsOfAGivenNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        // total bits
        int digits = (int) (log10(number) + 1);
        digits--;
        int sum = 0, lastDigit = 0;
        int num = number;
        int count = 0;

        while (num > 0) {
            lastDigit = num % 10;
            sum += (lastDigit + 1) * (int) (pow(10, count));
            count++;
            num /= 10;
        }

        System.out.println("Real Number is " + number + "\n" + "After the calculation " + sum);

    }
}
