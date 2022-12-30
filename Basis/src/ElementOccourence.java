import java.util.Scanner;
// 26
public class ElementOccourence {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int arraySize = sc.nextInt();
        // input
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }

        int count = 0;
        System.out.print("which elements occurrence you want to know : ");
        int n = sc.nextInt();

        for (int i = 0; i < arraySize; i++) {
            if (array[i] == n) {
                count++;
            }
        }

        System.out.println(n + " found " + count + " times in the array");
    }
}
