import java.util.Scanner;
// 17
public class Leapyearcheck {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if(year%400==0 || (year%4==0 && year%100!=0) )
            System.out.println(year  +" is LearYear");
        else
            System.out.println(year  +" not LearYear");

    }
}