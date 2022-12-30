import java.util.Scanner;

public class FindElementPositionIntheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        // input
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }

        int indexNo=0;
        System.out.print("which element position you want to know : ");
        int n= sc.nextInt();

        for (int i = 0; i < arraySize; i++) {
            if (array[i]== n) {
             indexNo=i;
             break;
            }
        }

        System.out.println(n + " found at indexNo " + indexNo);
    }
}
