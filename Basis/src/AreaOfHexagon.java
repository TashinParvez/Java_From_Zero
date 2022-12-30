import java.util.Scanner;
// 12
public class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hexagon one side size ");
        int a = sc.nextInt();

        double area = ((3 * Math.sqrt(3)) / 2) * a * a;
        System.out.println("Area  " + area);
    }
}
