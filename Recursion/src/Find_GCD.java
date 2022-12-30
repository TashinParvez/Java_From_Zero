import java.util.Scanner;

public class Find_GCD {
    static Scanner scan = new Scanner(System.in);

    static public void main(String[] args) {

        System.out.print("Enter 2 numbers (lower then upper): ");
        int lowerNumber = scan.nextInt();
        int upperNumber = scan.nextInt();


       int gcd= findGCD(lowerNumber, upperNumber);
        System.out.println("GCD = " + gcd);
    }

    static int findGCD(int low, int upp) {

        if(upp == 0)
            return low;
        else
            return findGCD(upp, low%upp);
    }

}