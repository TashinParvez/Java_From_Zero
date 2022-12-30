import java.util.Scanner;
//15
public class TotalPointsOfaGame {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter winss: ");
        int win = scan.nextInt();
        System.out.print("Enter draws: ");
        int draw = scan.nextInt();
        System.out.print("Enter looses: ");
        int loose = scan.nextInt();

        int totalPoints = win*3+draw*1+loose*0;
        System.out.println("totalPoints : " + totalPoints);
    }
}