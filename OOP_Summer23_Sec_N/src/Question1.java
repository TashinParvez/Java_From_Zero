import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int number = scanner.nextInt();
            int result = 10 / number;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("divisor is zero");
        } catch (java.util.InputMismatchException e) {
            System.out.println("input valid integer");
        } finally {
            scanner.close();
        }
    }
}