import java.util.Scanner;
// 14
public class FahrenheittoCelsius {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter fahrenheit degree : ");
        double f = sc.nextDouble();

        double c = (f - 32) * (0.5556);
        System.out.println(c+" C");
    }
}