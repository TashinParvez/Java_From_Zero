package Spring_21;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            int b;
            int c;
            int d;
            b = sc.nextInt();
            c = sc.nextInt();
            try {
                d = sc.nextInt();
            } catch (Exception e) {
                continue;
            } finally {
                System.out.println("Done");
            }

            a[b] = c / d;
        }//for
    }
}

