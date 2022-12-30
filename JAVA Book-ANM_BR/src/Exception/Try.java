package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int i = sc.nextInt();
            int j = sc.nextInt();
            try {
                int p = i / j;
                if (p < 2) {
                    throw new Exception("P is less than 2");
                } else if (p > 10) {
                    throw new Exception("P is gratter than 10");
                }
            } catch (ArithmeticException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (InputMismatchException e) {
            System.out.println(e);
        } finally {
            System.out.println("Program End");
        }
    }
}