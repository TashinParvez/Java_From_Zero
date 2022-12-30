import java.util.Scanner;
// 35
public class FibonacciSeries {
    public static int a = 0;
    public static int b = 1;
    public static int temp = 1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter how many fibo Number You want to see : ");
        int number = sc.nextInt();

        fibonacciSeries(number, 1);
    }

    static void fibonacciSeries(int number, int i) {

        if (i > number)
            return;

        if (i == 1) {
            System.out.print(a + " ");

        } else if (i == 2) {
            System.out.print((a + b) + " ");
        } else {
            System.out.print((a + b) + " ");
            temp = a + b;
            a = b;
            b = temp;
        }
        fibonacciSeries(number, ++i);
    }
}