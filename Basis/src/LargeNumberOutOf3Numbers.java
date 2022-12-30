import java.util.Scanner;
// 22
public class LargeNumberOutOf3Numbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        a = largeoutOf3(a, b, c);

        System.out.println("Large Number " + a);
    }

    static int largeoutOf3(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        else if (b >= c)
            return b;
        else
            return c;
    }
}
