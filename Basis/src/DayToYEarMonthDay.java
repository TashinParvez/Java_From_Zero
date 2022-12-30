import java.util.Scanner;
// 20
public class DayToYEarMonthDay {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter Days: ");
        int days = sc.nextInt();

        int day = 0, year = 0, month = 0;

        year = days / 365;
        days = days % 365;
        month = days / 30;
        day = days % 30;

        System.out.println(year + "Y " + month + "M " + day + "D ");
    }
}