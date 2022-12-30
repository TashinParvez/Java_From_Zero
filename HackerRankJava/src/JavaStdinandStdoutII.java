import java.util.Scanner;

public class JavaStdinandStdoutII {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        double dou = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + dou);
        System.out.println("Int: " + number);
    }
}
