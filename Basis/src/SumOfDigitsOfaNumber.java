import java.util.Scanner;
// 17
public class SumOfDigitsOfaNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        int totalSum = 0;
        while (number > 0) {
            totalSum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits " + totalSum);
    }
}