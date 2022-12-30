package cheeggg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Toll t = new Toll();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Motocycle\n2. Bus\n3. Truck\n4. Car\n5. Train\n6. Exit");
        int choice;
        System.out.print("Enter your cboice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                t.motocycle();
                break;
            case 2:
                t.bus();
                break;
            case 3:
                t.truck();
                break;
            case 4:
                t.car();
                break;
            case 5:
                t.train();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Chooce correct input...");
                main(null);
        }
    }
}
