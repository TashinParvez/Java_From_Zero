import java.util.Scanner;
// 23
public class PrintFirst_10SquareNumberAndSumofThem {
    static public int sum = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        squatreNumber(1);

    }

    static void squatreNumber(int i) {
        sum += i * i;
        if (i == 10) {

            System.out.print(i * i);
            System.out.println("= " + sum);
            return;
        }
        System.out.print(i * i + "+");
        squatreNumber(++i);
    }
}