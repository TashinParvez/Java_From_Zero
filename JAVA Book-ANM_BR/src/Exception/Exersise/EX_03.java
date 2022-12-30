package Exception.Exersise;

import java.util.Scanner;

public class EX_03 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {

                int a = sc.nextInt();
                int b = sc.nextInt();
                callMethod(a, b);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e);
                System.out.println("please enter another inputs");
            }
        }
    }

    static void callMethod(int a, int b) throws IllegalArgumentException {
        if (a <= 0 || b <= 0)
            throw new IllegalArgumentException();
        else
            System.out.println("all are Correct");
    }
}