// 16
import java.util.Scanner;

public class AreaOfACircle {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter radius ");
        double a = scan.nextDouble();

        System.out.println("Area of a Circle = " + area(a));
    }

    static double area(double a) {
        return 3.1416 * Math.pow(a, 2);
    }
}