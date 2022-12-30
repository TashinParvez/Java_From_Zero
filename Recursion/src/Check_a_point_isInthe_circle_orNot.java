import java.util.Scanner;
// 28
public class Check_a_point_isInthe_circle_orNot {
    static public void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter radious : ");
        double radious= scan.nextDouble();

        System.out.println("Enter center(x,y): ");
        int x1= scan.nextInt();
        int y1= scan.nextInt();

        System.out.println("Enter checking point (x2,y2): ");
        int x2= scan.nextInt();
        int y2= scan.nextInt();

        double n= Math.pow((x1-x2),2) + Math.pow((y1-y2),2);
        double distanceFromCenter= Math.sqrt(n);

        System.out.println("Distance from center : "+distanceFromCenter);

        if(distanceFromCenter<=radious)
            System.out.println("Inside The circle");
        else
            System.out.println("outside from the circle");

    }
}