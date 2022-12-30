import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p;


        while (true) {
            System.out.print("Principal: ");
            p = scan.nextInt();
            if (!(p >= 1000) || !(p <= 10_000))
                System.out.println("Enter a value between (1000 to 10_000):  ");
            else
                break;
        }

        float r;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            r = scan.nextFloat();

            if (!(r > 0) || !(r <= 30))
                System.out.println("Enter a value between (0 to 30):  ");
            else
                break;
        }


        int n;
        while (true) {
            System.out.print("Period (Years): ");
            n = scan.nextInt();

            if (!(n > 0) || !(n <= 30))
                System.out.println("Enter a value between (0 to 30):  ");
            else
                break;
        }


        float m = (p * (r / 100) * (float) Math.pow((1 + (r / 100)), n)) / (float) (Math.pow((1 + (r / 100)), n) - 1);
        System.out.println("Mortage: " + m);

    }
}