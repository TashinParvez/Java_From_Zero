import java.util.Scanner;
// 29
public class SumOfAllArrayElements {
    static Scanner scan = new Scanner(System.in);

    static public void main(String[] args) {

        System.out.print("Enter array size: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.println("enter array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int sum = printarray(arr, size, 0, 0);
        System.out.println(sum);
    }

    static int printarray(int[] arr, int size, int index, int sum) {

        if (index == size)
            return 0;
        else
            sum = arr[index];

        return sum + printarray(arr, size, ++index, sum);
    }
}