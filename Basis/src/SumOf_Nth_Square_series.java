import java.util.Scanner;
// 17
public class SumOf_Nth_Square_series {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        int total = 0;
        for (int k = 1; k <= number; k++) {
            total += k * k;
        }

        System.out.println("total = " + total);
    }
}