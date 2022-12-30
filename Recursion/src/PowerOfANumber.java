import java.util.Scanner;
// 21
public class PowerOfANumber {
    static Scanner scan = new Scanner(System.in);

    static public void main(String[] args) {
        System.out.print("Enter number : ");
        int number = scan.nextInt();

        System.out.print("Enter power : ");
        int power = scan.nextInt();

        System.out.println("PowerofNumber " + powerofNumber(number, power));
    }

    static int powerofNumber(int number, int power) {
        if (power == 0)
            return 1;
        return number * powerofNumber(number, --power);
    }
}