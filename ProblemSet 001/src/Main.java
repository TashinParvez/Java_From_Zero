import java.util.Scanner;
import java.lang.*;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter how many box you have : ");
        int totalBoxs = scan.nextInt();
        Box[] userBoxes = new Box[totalBoxs];

        System.out.println("Input all box informations");

        for (int i = 0; i < userBoxes.length; i++) {
            System.out.println(i + 1 + " no box length, width , height");
            userBoxes[i].inputBoxInformations(scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
        while (true) {
            System.out.println("Which box Information Do you want ?\n or type -1 to exit from this system");
            int boxNumber = scan.nextInt();
            if (boxNumber < 0)
                break;
            else
                userBoxes[boxNumber].printBoxInformation();
        }
    }
}