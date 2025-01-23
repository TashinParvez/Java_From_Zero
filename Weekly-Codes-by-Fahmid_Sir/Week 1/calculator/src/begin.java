import java.util.Scanner;

public class begin {

    public static void main(String[] args) {

        double a = 20;
        double b = 20;
        String s;

        Scanner sc = new Scanner(System.in);

        for(;;)
        {
            a = sc.nextDouble();
            s = sc.next();
            b = sc.nextDouble();

            double sum = a + b;
            double sub = a - b;
            double mult = a * b;
            double div = a / b;

            if(s.equals("+"))
            {
                System.out.println("The Sum = "+sum);
            }
            else if (s.equals("-"))
            {
                System.out.println("The Sub = "+sub);
            }
            else if (s.equals("*"))
            {
                System.out.println("The Mult = "+mult);
            }
            else if (s.equals("/"))
            {
                System.out.println("The div = "+div);
            }
            else if (a==-1 || s.equals("off"))
            {
                break;
            }
            }
    }

}
