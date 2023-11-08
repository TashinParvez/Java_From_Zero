package Summer_2022.Q_1;

public class Main {
    final private static double PI = 3.1416;


    static void calculate(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {

        calculate(5.00);

    }
}

