import java.util.Scanner;

public class Throw {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a integer ");
        int l = sc.nextInt();

        try {

            if (l <= 0)
                throw new Exception("l have to gratter than 0 ");
            else
                System.out.println("OK");

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
