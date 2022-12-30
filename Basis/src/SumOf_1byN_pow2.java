import java.util.Scanner;
// 17
public class SumOf_1byN_pow2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int n = scan.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += ((double) 1 / (i * i));
        }
        System.out.println("Sum " + sum);
    }
}