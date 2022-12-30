import java.util.Scanner;
// 38
public class FindPrimeNumbersInGivenRangeUsingFunctions {
    static Scanner scan = new Scanner(System.in);

    static public void main(String[] args) {

        System.out.print("Enter lower input : ");
        int lowerNumber = scan.nextInt();

        System.out.print("Enter upper input : ");
        int upperNumber = scan.nextInt();

        findPrimeNumber(lowerNumber, upperNumber);

    }

    static void findPrimeNumber(int low, int upp) {

        for (int i = low; i <= upp; i++) {
            if (i == 2) {
                System.out.println(i + " ");
                continue;
            } else {
                if (chekPrimeOrNot(i))
                    System.out.println(i + " ");
            }
        }
    }

    static boolean chekPrimeOrNot(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
