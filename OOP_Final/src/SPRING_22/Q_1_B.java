package SPRING_22;

interface Vehicle {
    void fuelType();
}

public class Q_1_B {
    public static void main(String[] args) {
        Vehicle cng;
        Vehicle airplane;
        cng = new Vehicle() {
            @Override
            public void fuelType() {
                System.out.println("Uses LPG");
            }
        };

        airplane = new Vehicle() {
            @Override
            public void fuelType() {
                System.out.println("Uses Jet Fuel");
            }
        };
        cng.fuelType();
        airplane.fuelType();
    }
}
