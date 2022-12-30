package HS_MID_OOP_LAB.Q_3;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MyCalculator calculate = new MyCalculator();
        System.out.print("ENTER A NUMBER : ");

        int sum = calculate.divisor(sc.nextInt());
        System.out.println("Sum = " + sum);
    }
}
