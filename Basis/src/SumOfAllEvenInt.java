import java.util.Scanner;

public class SumOfAllEvenInt {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter arraySize: ");
        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];
        int sum = 0;
        for (int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                sum += arr[i];
        }
        System.out.println("SUM = " + sum);
    }
}