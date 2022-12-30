package Exception;

import java.util.Scanner;

public class InputCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int i = sc.nextInt();
            System.out.println("You entered "+i );
        }

    }
}
