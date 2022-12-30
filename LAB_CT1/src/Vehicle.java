import java.util.Scanner;

public class Vehicle {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter distance traveled and fuel consumption of a car ");
        Car myCar = new Car(scan.nextDouble(), scan.nextDouble());

        System.out.print("Please Enter a Choice : " +
                "1 for Mileage of a Car.\n" +
                "2 for Cost of fuel.\n");

        int optionChoosed = scan.nextInt();

        double mileage, cost;
        if (optionChoosed == 1) {
            mileage = myCar.getMileage();
            System.out.println("Mileage " + mileage);
        } else {
            cost = myCar.getCost();
            System.out.println("Cost " + cost + "$");
        }
    }
}