package UserDefine_Exception;

import USER_DEFINE_Exception.MyException;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how much TK you want to recharge");
        double yourAmount = sc.nextDouble();
        try {
            if (yourAmount <= 10) {
                throw new MyException();
            } else {
                System.out.println("you can recharge");
            }
        } catch (MyException ex) {
            System.out.println(ex);
        }
    }
}
