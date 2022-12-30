package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p_397 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an integer");
        int number = 0;
        do {
            try {
                number = input.nextInt();
                if (number != -1) {
                    System.out.println("you entered " + number + " , enter another number (-1 exit): ");
                } else {
                    System.out.println("program exited");
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("please enter only a number: ");
                input.nextInt();
            }
        } while (number != -1);
    }
}
