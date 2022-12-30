import java.util.Scanner;
// 25
public class CheckaNumberIsPerfectOrNot {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        checkPerfectOrNot(number);

    }

    static void checkPerfectOrNot(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0)
                sum += i;
        if (sum == number)
            System.out.println(number + " yes its a perfect Number");
        else
            System.out.println(number + " no ist not a perfect Number");
    }
}