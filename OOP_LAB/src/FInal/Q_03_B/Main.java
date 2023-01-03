package FInal.Q_03_B;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            int num = sc.nextInt();
            testMethod(num);

        } catch (IllegalParaneterExcepetion e) {
            System.out.println(e.toString());
        }

    }
    public static void testMethod(int num) throws IllegalParaneterExcepetion {
        if (num < 0)
            throw new IllegalParaneterExcepetion();
        else {
            int value = -9999;
            int flag = 0;
            for (int i = 0; value < num; i++) {
                value = (int) (Math.pow(3, i));
                if (value == num)
                    flag = 1;
            }
            if (flag == 0) {
                System.out.println("No its not multiple of 3");
            } else
                System.out.println("yes its multiple of 3");
        }
    }
}