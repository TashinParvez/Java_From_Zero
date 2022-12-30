package OOP_ANIKA_Maam;

public class Vehicle {

    double vehicleWeight;
    double caringWeights;
    int category;
    int card;
    double haveToPay;

    double pG;
    double vehicle; //200

    void amount() {
        if (category == 1) {
            calculateDiscount(0.0);
        } else if (category == 2) {
            calculateDiscount(vehicle * ((double) 2 / 100));
        } else if (category == 3) {
            vehicle += 200;
            calculateDiscount(vehicle);
        } else if (category == 4) {
            vehicle += 100;
            calculateDiscount(vehicle);
        }
    }

    void calculateDiscount(double amount) {
        switch (card) {
            case 1:
                haveToPay = amount * ((double) 10 / 100);
                if (category == 1) {
                    haveToPay = 0.0;
                }
                break;

            case 2:
                haveToPay = amount * ((double) 8 / 100);
                if (category == 1) {
                    haveToPay = 0.0;
                }
                break;

            case 3:
                haveToPay = amount * ((double) 5 / 100);
                if (category == 1) {
                    haveToPay = 0.0;
                }
                break;

            case 4:
                haveToPay = amount;
                if (category == 1) {
                    haveToPay = 0.0;
                }
                break;
        }
    }

    static int category() {
        System.out.println("Choose a type :");
        System.out.println("1. Gov\n2. Personal+gov\n3. Carring Goods\n4. Public\n");
        return Main.sc.nextInt();
    }

    static int card() {
        System.out.println("Choose a type :");
        System.out.println("1. Platinum\n2. Gold\n3. Silver\n4. none");
        return Main.sc.nextInt();
    }
}
