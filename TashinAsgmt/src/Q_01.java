import java.util.Scanner;

public class Q_01 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int totalDigits = countTotalDigits(number);
        System.out.print("Enter Which digit you want to see : ");
        int digitNo = sc.nextInt();

        if (digitNo > totalDigits)
            System.out.println("Sorry, This digit is not available in this Number");
        else {
            int digitNoNumber = 0;
            int rotation = totalDigits - digitNo + 1;

            while (rotation > 0) {
                digitNoNumber = number % 10;
                number /= 10;
                rotation--;
            }
            System.out.println(digitNo + "th number is " + digitNoNumber);
        }
    }
    // Count total digits
    static int countTotalDigits(int number) {
        int digits = 0;
        while (number > 0) {
            digits++;
            number /= 10;
        }
        return digits;
    }
}
