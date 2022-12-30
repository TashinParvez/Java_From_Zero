import java.util.Scanner;

public class StackTrace_Exception {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        int a = sc.nextInt();
//        int b = sc.nextInt();

        int a = 10;
        int b = 19;

        try {
            sum(a, b);
        } catch (Exception ar) {
            //  System.out.println(ar);
            //  System.out.println(ar.getMessage());
            ar.printStackTrace();
        }
        System.out.println("Running");
    }

    static void sum(int a, int b) {
        int s = a + b;
        div(s);
    }

    static void div(int s) {
        mult(s * 0);
    }

    static void mult(int a) {
        int b = 10;
        System.out.println("b / a = " + (b / a));
    }
}