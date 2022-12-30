import java.util.Scanner;
//15
public class FindVolume {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter length: ");
        int length = scan.nextInt();
        System.out.print("Enter width: ");
        int width = scan.nextInt();
        System.out.print("Enter height: ");
        int height = scan.nextInt();

        int volume = length*height*width;
        System.out.println("Volume : " + volume);
    }
}
