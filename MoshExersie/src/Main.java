import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");

        int number = scan.nextInt();
        if (number % 5 == 0) {
            if (number % 3 == 0) {
                System.out.println("FizzBuzz");
            } else
                System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else
            System.out.println(number);
    }
}