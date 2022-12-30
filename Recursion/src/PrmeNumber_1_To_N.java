import java.util.Scanner;
// 35
public class PrmeNumber_1_To_N {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        checkPrimeNumber(2, number);
    }

    static void checkPrimeNumber(int n, int number) {
        if (n > number)
            return;
        printPrimeNumber(n);
        checkPrimeNumber(++n, number);
    }

    static void printPrimeNumber(int n) {
        if (n == 2)
            System.out.println(n);

        else {

            for (int i = 2; i < n; i++) {

                if (n % i == 0)
                    return;
            }
            System.out.println(n);
        }
    }
}