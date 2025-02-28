import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        int number = 22;
        double a = 20.55;
        double s = number + a;
        System.out.print("Hello Spring "+s+"  111\n");
        System.out.println("Hello Spring "+"number" + a);
        System.out.println("Hello Spring "+number + a);
        System.out.println("Hello Spring "+(number + a));
        System.out.println("Fahmid Al Rifat\n");

        System.out.println("Enter the number = ");

        Scanner input = new Scanner(System.in);
        number = input.nextInt();


        if(number%2==0)
        {
            System.out.println("EVEN");
        }
        else
        {
            System.out.println("Odd");
        }

        a = input.nextDouble();
        System.out.println("Double value = "+a);

    }

}
