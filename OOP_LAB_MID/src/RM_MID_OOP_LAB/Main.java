package RM_MID_OOP_LAB;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("Is it a Government employee ?");
            System.out.println("If yes enter 1\n else enter 0");
            int e = sc.nextInt();
            if (e == 1) {
                System.out.println("Is it a Government car?");
                System.out.println("If yes enter 1\n else enter 0");
                int p = sc.nextInt();
                if(p==1)
                {
                    System.out.println("You dont need to pay tax");
                }
                else {

                }

            } else {
                System.out.println("Are you a taxpayer ?");
                System.out.println("If yes enter 1\n else enter 0");
                int n = sc.nextInt();
                if (n == 1) {
                    System.out.println("Please enter vehicleType ,  Card name, weight");
                    TollBooth user = new TollBooth(sc.nextLine(), sc.nextLine(), sc.nextDouble(), 1);
                    System.out.println("You have to pay " + user.haveToPay());

                } else {
                    TollBooth user = new TollBooth(sc.nextLine(), sc.nextDouble());
                    System.out.println("You have to pay " + user.haveToPay());
                }
            }
        }
    }
}