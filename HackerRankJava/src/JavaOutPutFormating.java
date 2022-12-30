import java.util.Scanner;

public class JavaOutPutFormating {
    public static void main(String[] args) {

        String[] arr = new String[3];
        int[] arr2 = new int[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.next();
            arr2[i] = sc.nextInt();
        }

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {

            for (int ii = 0; ii < 15; ii++) {
                if (ii < arr[i].length()) {
                    System.out.print(arr[i].charAt(ii));
                } else
                    System.out.print(' ');
            }

            int n = arr2[i];
            int count = 0;
            while (n != 0) {
                n = n / 10;
                count = count + 1;
            }
            if (arr2[i] == 0)
                count++;

            for (int ii = 0; ii < (3 - count); ii++) {
                System.out.print(0);
            }
            System.out.println(arr2[i]);
        }
        System.out.println("================================");
    }
}



