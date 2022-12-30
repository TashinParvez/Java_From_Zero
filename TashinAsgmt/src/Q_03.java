import java.util.Scanner;

public class Q_03 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        System.out.print("Enter all array elements : ");
        int[] array = new int[size];

        //______Taking elements Inputs
        for (int i = 0; i < size; i++)
            array[i] = sc.nextInt();

        System.out.print("Enter an element, you want to see the number of occurrences: ");
        int element = sc.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == element)
                count++;
        }

        System.out.println(element + " occurrence is " + count);
    }
}
