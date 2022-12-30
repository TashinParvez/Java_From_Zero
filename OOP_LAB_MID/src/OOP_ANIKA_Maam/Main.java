package OOP_ANIKA_Maam;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Choose a type :");

        System.out.println("1.Truck\n2.Bus\n3.Motorcycle\n4.Car\n");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                // Truck myTruck = new Truck(Vehicle.category(), Vehicle.card(), 200);
                // System.out.println("\n\n--------------> You have to pay " + myTruck.haveToPay + "\n\n");
                System.out.println("\n\n--------------> You have to pay " + calculateTol(new Truck(Vehicle.category(), Vehicle.card(), 200)) + "\n\n");
                break;
            case 2:
                Bus myBus = new Bus(Vehicle.category(), Vehicle.card(), 150);
                System.out.println("\n\n--------------> You have to pay " + myBus.haveToPay + "\n\n");
                break;
            case 3:
                Bus myMotorcycle = new Bus(Vehicle.category(), Vehicle.card(), 50);
                System.out.println("\n\n--------------> You have to pay " + myMotorcycle.haveToPay + "\n\n");
                break;
            case 4:
                Bus myCar = new Bus(Vehicle.category(), Vehicle.card(), 120);
                System.out.println("\n\n--------------> You have to pay " + myCar.haveToPay + "\n\n");
                break;
        }

        main(new String[12]); // for infinity loop
    }

    //    static void calculateTol(Vehicle obj) {
//        System.out.println("\n\n--------------> You have to pay " + obj.haveToPay + "\n\n");
//    }
//
    static double calculateTol(Vehicle obj) {
        return obj.haveToPay;
    }
}