import java.util.Scanner;
// 26
public class FactorialOfANumber {
    public static int sum = 1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        factorialNUM(number, 1);
        System.out.println("Factorial of " + number + " is " + sum);
    }

    static int factorialNUM(int number, int i) {

        if (i == number) {
            sum *= number;
            return 0;
        }
        sum *= i;
        factorialNUM(number, ++i);
        return 0;
    }
}