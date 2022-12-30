import java.util.Scanner;

import static java.lang.Math.log10;

public class NthDigitOfaNumber {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        System.out.print("Which digit you want to see: ");
        int digit = scan.nextInt();

        // ----- total digits
        // int totalDigits = (int) (log10(number) + 1);
        int num = number;
        int totalDigits=0;
        while(num>=0){
            totalDigits+=1;
            num/=10;
        }



        digit = totalDigits + 1 - digit;
        int n=0;
        int lastdigit=0;
        while(n<digit){
            lastdigit=number%10;
            number/=10;
            n++;
        }

        System.out.print(lastdigit);

    }
}
