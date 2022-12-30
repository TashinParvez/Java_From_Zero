package cheeggg;

import java.util.Scanner;

public class Car extends Train {
    public void car() {
        int choice;
        double amount, total, tax, res;
        cards c = new cards();
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Govt\n2. Personal or Carriage Of Goods or Public etc.\n3. Personal Vehicle with Govt Official\n4. Back");
        System.out.print("Enter your cboice: ");
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("No tax");
            m.main(null);
        } else if (choice == 2) {
            System.out.println("1. Platinum\n2. Gold\n3. Silver\n4. Back");
            System.out.print("Enter your cboice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter toll amount for car: ");
                amount = sc.nextDouble();
                res = c.platinum(0.10, amount);
                System.out.println("Toll gate tax is: " + res);
                System.out.println("Total amount to be paid to toll is: " + (amount + res));
                m.main(null);
            } else if (choice == 2) {
                System.out.println("Enter toll amount for car: ");
                amount = sc.nextDouble();
                res = c.gold(0.08, amount);
                System.out.println("Toll gate tax is: " + res);
                System.out.println("Total amount to be paid to toll is: " + (amount + res));
                m.main(null);
            } else if (choice == 3) {
                System.out.println("Enter toll amount for car: ");
                amount = sc.nextDouble();
                res = c.silver(0.05, amount);
                System.out.println("Toll gate tax is: " + res);
                System.out.println("Total amount to be paid to toll is: " + (amount + res));
                m.main(null);
            } else if (choice == 3) {
                System.out.println("Enter toll amount for car: ");
                amount = sc.nextDouble();
                res = c.personalwithgovt(0.02, amount);
                System.out.println("Toll gate tax is: " + res);
                System.out.println("Total amount to be paid to toll is: " + (amount + res));
                m.main(null);
            } else if (choice == 4) {
                Car c1 = new Car();
                c1.car();
            } else {
                System.out.println("Choose correct input...");
                Car c1 = new Car();
                c1.car();
            }
        } else if (choice == 3) {
            System.out.println("Enter toll amount for choice: ");
            amount = sc.nextDouble();
            res = c.personalwithgovt(0.02, amount);
            System.out.println("Toll gate tax is: " + res);
            System.out.println("Total amount to be paid to toll is: " + (amount + res));
            m.main(null);
        } else if (choice == 4) {
            m.main(null);
        } else {
            System.out.println("Choose correct input...");
            Toll t = new Toll();
            t.motocycle();
        }
    }
}

