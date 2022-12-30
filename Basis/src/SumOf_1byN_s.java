import java.util.Scanner;
// 17 (       SumOf_         )
public class SumOf_1byN_s {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += ((double) 1 / i);
        }
        System.out.println("Sum " + sum);

    }
}