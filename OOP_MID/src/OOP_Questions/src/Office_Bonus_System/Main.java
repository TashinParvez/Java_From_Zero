package Office_Bonus_System;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Emploee worker = new Emploee();

//        System.out.print("Enter Your Category : ");
//        worker.category = scan.next().charAt(0);
//        System.out.print("Enter Your year of experience : ");
//        worker.experience = scan.nextInt();
//        System.out.print("Number of family members : ");
//        worker.setNumberOfFamilyMembers(scan.nextInt());
//
//        System.out.print("Number of Incomes : ");
//        worker.setTotalFamilyIncome(scan.nextInt());
//
//        worker.elegableOrNot();



        Emploee worker4 = new Emploee('x');
        worker4.toString();

//        Emploee worker5 = new Emploee('z');
//        System.out.println(worker4.equals(worker5));

    }
}
