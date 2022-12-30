import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str[] = new String[3];
        int t[] = new int[3];

        for (int i = 0; i < 3; i++) {
            str[i] = sc.next();
            t[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(str[i]);
                for (int j=1;j<=15-str[i].length();j++)
                    System.out.println(' ');
            System.out.println(t[i]);
        }


    }
}