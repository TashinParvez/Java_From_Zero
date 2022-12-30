import java.util.Scanner;
// 20
public class MultiplicationTable {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        multiplicationTableOut(number, 1);

    }

    static void multiplicationTableOut(int number, int n) {
        if (n > 10)
            return;
        System.out.println(number + " x " + n + " = " + number * n);
        multiplicationTableOut(number, ++n);
    }
}