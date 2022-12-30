import java.util.Scanner;
// 30
public class PrintAllArrayElements {
    static Scanner scan = new Scanner(System.in);

    static public void main(String[] args) {

        System.out.print("Enter array size: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.println("enter array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        printarray(arr, size, 0);
    }

    static void printarray(int arr[], int size, int index) {

        if (index == size)
            return;
        else
            System.out.print(arr[index] + " ");

        printarray(arr, size, ++index);
        return;
    }
}