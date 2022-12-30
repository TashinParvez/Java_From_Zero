import java.util.Scanner;
//21
public class PalindromeNumberCheck {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        int num = number;
        int sum = 0;
        while (number > 0) {
            sum = sum * 10 + number % 10;
            number /= 10;
        }
        if (num == sum)
            System.out.println("yes its Palindrom " + sum);
        else
            System.out.println("No its not palindrom " + sum);

    }
}
