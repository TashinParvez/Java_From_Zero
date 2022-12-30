import java.util.Scanner;
// 19
public class SumofDiGitOfANumber_ByRecursion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("Sum is " + sum);
    }

    static int sumOfDigits(int number) {
        if (number <= 0)
            return 0;
        return number % 10 + sumOfDigits(number / 10);
    }
}
