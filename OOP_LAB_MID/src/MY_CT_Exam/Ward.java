package Exam;

import java.util.Scanner;

abstract class Bed {
    static Scanner sc = new Scanner(System.in);
    int costforOneDAy = 20;
    int ward;
    int daysStayed;
    int offerGot;

    // double haveToPa= 0.00;

    int pay;


    abstract void unitCharge();  //______________make it abstruct

    static int selectWard() {
        System.out.println("\nChoose a option (ENTER INTEGER NUMBER ONLY)");
        System.out.println("1. General Ward\n2. Children Ward\n3. Cancer Ward\n4. Burn_Unit\n");
        return sc.nextInt();
    }

    static int numberOfDaysStayed() {
        System.out.println("Enter how many days stay");
        return sc.nextInt();
    }

    static int forOffer() {
        System.out.println("\nChoose a option (ENTER INTEGER NUMBER ONLY)");

        System.out.println("1. Family Discount 20%\n2. Relative Discount 10%\n3. Emoployee of this hospital\n4. None\n");
        return sc.nextInt();
    }

    abstract double showBill();  //______________make it abstruct
}