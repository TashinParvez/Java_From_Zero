import java.util.Scanner;
// 30
public class CheckANumberIsPrimeOrNot {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        checkPrime(2, number);
    }

    static void checkPrime(int i, int number) {
        if (i == number) {

            System.out.println(number + " is a Prime number");
            return;
        }
        if (number == 2)
            System.out.println(number + " is a Prime number");
        else {
            if (number % i == 0) {
                System.out.println(number + " not a prime Number");
                return;
            } else
                checkPrime(++i, number);
        }
    }
}