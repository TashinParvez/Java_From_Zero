import java.util.Scanner;

public class JAva_DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int flag = 0;
            long n = sc.nextLong();

            if (n - (byte) n == 0) {
                if (flag==0) {
                    System.out.println(n + " can be fitted in:");
                }
                System.out.println("* byte");
                flag++;
            }
            if (n - (short) n == 0) {
                if (flag == 0) {
                    System.out.println(n + " can be fitted in:");
                }
                System.out.println("* short");
                flag++;
            }
            if (n - (int) n == 0) {
                if (flag == 0) {
                    System.out.println(n + " can be fitted in:");
                }
                System.out.println("* int");
                flag++;
            }
            if (n - (long) n == 0) {
                if (flag == 0) {
                    System.out.println(n + " can be fitted in:");
                }
                System.out.println("* long");
                flag++;
            }
            if (flag == 0) {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }
    }
}
