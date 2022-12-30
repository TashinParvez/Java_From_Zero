class Car {
    double distance = 0;
    double fuel = 0;

    Car(double distance, double fuel) {
        this.distance = distance;
        this.fuel = fuel;
    }

    double getMileage() {
        return distance / fuel;
    }

    double getCost() {
        return fuel * 4;
    }
}
