package USER_DEFINE_Exception;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how much TK you want to recharge");
        double yourAmount = sc.nextDouble();

        try {
          checkAmount(yourAmount);

        } catch (MyException ex) {
            System.out.println(ex);
        }

    }

    static void checkAmount(double yourAmount) throws MyException {
        if (yourAmount <= 10) {
            throw new MyException();
        } else {
            System.out.println("you can recharge");
        }
    }
}
