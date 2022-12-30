import java.util.Scanner;
// 20
public class SkipMiddleNumberAsAssign {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int first = 0;
        int last = 0;
        for (int i = 1; i <= 3; i++) {
            if (i == 1)
                first = scan.nextInt();
            else {
                last = scan.nextInt();
            }
        }
        System.out.println("First = " + first);
        System.out.println("Last = " + last);
    }
}
