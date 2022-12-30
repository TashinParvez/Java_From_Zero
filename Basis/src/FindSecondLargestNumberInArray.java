import java.util.Scanner;
// 26
public class FindSecondLargestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }
        int large = -9999;
        int secondLarge = -999;

        for (int i = 0; i < arraySize; i++) {
            if (array[i] > large) {
                secondLarge = large;
                large = array[i];
            } else if (array[i] > secondLarge)
                secondLarge = array[i];
        }

        System.out.println("Largest Number in array : " + large);
        System.out.println("Second Largest Number in array : " + secondLarge);

    }
}
