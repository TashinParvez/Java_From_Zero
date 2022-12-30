package RM_MID_OOP_LAB;

public class TollBooth {

    static double totalPaiedAmount = 0;
    double weight;  // input from constructor
    String vehicleType="n"; // input from constructor
    String card;  // if not user then not use
    int user; // from constructor
    double taxRate = TollBooth.setTaxRate(vehicleType);  // then go have to pay method


    public TollBooth(String vehicleType, double weight) {  // who is not a user
        this.vehicleType = vehicleType;
        this.weight = weight;
        user = 0;
    }

    public TollBooth(String vehicleType, String card, double weight, int user) { // who is a user
        this(vehicleType, weight);
        this.card = card;
        this.user = user;
    }


    double haveToPay() {
        if (user == 1) {

//        double pay = weight * taxRate;
//        totalPaiedAmount+=pay;
//        return pay;
            return 0.0;
        }
        else {       // who is not a user
            double pay = weight * taxRate;
            totalPaiedAmount+=pay;
            return pay;
        }
    }


    static double setTaxRate(String vehicleType) {
        return switch (vehicleType.toLowerCase()) {
            case "motorcycle" -> 5.00;
            case "bus" -> 20.00;
            case "truck" -> 25.00;
            case "car" -> 10.00;
            default -> 0.0;
        };
    }
}