class CarFactory {
    int id;
    String name;

    public static void status() {
        System.out.println("Running");
    }

    CarFactory() {  //_______Constructor
        id = 1221;
        name = "AUDY";
        status();
    }

    CarFactory(int number) {  //_______Constructor
        id = number;
        name = "AUDY";
        status();
    }

}

public class ConstructorInJAVA {
    public static void main(String[] args) {

        // CarFactory toyota = new CarFactory();
        CarFactory Audi = new CarFactory(19);

        System.out.println(Audi.id);
    }
}
