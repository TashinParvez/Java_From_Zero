import java.util.Scanner;

// 27
public class SumOf_1byN_factorials {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += ((double) 1 / factorial(i));
        }

        System.out.println("Sum " + sum);

    }

    static int factorial(int i) {
        int power = 1;
        for (int j = 2; j <= i; j++) {
            power *= j;
        }
        return power;
    }
}