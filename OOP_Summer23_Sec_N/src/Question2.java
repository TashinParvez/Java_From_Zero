import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};

            System.out.println("Result: " + divideNumbers(numbers, 0, 2));

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }
    }

    public static int divideNumbers(int[] numbers, int ind1, int ind2) {
        try {
            int result = numbers[ind1] / numbers[ind2];
            return result;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("By zero");
        }
    }
}
