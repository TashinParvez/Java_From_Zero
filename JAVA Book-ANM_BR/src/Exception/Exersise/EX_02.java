package Exception.Exersise;

import java.util.Scanner;

public class EX_02 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        while (true) {
            try {
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("a+b = " + (a + b) + "\na-b = " + (a - b) + "\na*b = " + (a * b) + "\na/b = " + (a / b));
                break;
            } catch (ArithmeticException e) {
                System.out.println("Value is not acceptable\nPlease enter again");
            }
        }

    }
}
