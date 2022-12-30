import java.util.Scanner;
// 12
public class RadiansToDegree {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter radian value : ");
        double rad = scan.nextDouble();
        final double pi = 3.1416;
        double degree = rad * (180 / pi);

        System.out.println("Degree : " + degree);
    }
}
