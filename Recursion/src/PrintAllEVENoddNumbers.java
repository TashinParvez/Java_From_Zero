import java.util.Scanner;

// 42
public class PrintAllEVENoddNumbers {
    static Scanner scan = new Scanner(System.in);

    static public void main(String[] args) {

        System.out.print("Enter lower input : ");
        int lowerNumber = scan.nextInt();

        System.out.print("Enter upper input : ");
        int upperNumber = scan.nextInt();

        System.out.print("even Numbers : ");
        evennumbers(lowerNumber, upperNumber);
        System.out.println();
        System.out.print("Odd Numbers : ");
        oddnumbers(lowerNumber, upperNumber);

    }

    static int evennumbers(int low, int upp) {
        if (low > upp)
            return 0;

        if (low % 2 == 0)
            System.out.print(low + " ");

        evennumbers(++low, upp);

        return 0;
    }

    static int oddnumbers(int low, int upp) {
        if (low > upp)
            return 0;

        if (low % 2 != 0)
            System.out.print(low + " ");

        oddnumbers(++low, upp);

        return 0;
    }

}