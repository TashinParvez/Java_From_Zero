import java.util.Scanner;

public class Circle {
    static Scanner scan = new Scanner(System.in);
    static final double PI = 3.1416D;

    public static void main(String[] args) {
        System.out.print("Enter Radius of the circle : ");
        double radius = scan.nextDouble();

        System.out.print("Enter Circle Center of the circle : ");
        Point center = new Point();
        center.x = scan.nextInt();
        center.y = scan.nextInt();
        System.out.println("\nArea of this Circle " + area(radius));

        System.out.print("Enter a point to check whether it is inside of this circle or not : ");
        Point aPoint = new Point();
        aPoint.x = scan.nextInt();
        aPoint.y = scan.nextInt();

        boolean pointCheck = pointInsideCircle(center.x, center.y, aPoint.x, aPoint.y, radius);
        if (pointCheck)
            System.out.println("\nYes" + "(" + aPoint.x + "," + aPoint.y + ")" + "this point is inside of this circle");
        else
            System.out.println("\nNo" + "(" + aPoint.x + "," + aPoint.y + ")" + "this point is not inside of this circle");


    }

    static double area(double radius) {
        return PI * Math.pow(radius, 2);
    }

    static boolean pointInsideCircle(int centerX, int centerY, int pointX, int pointY, double radius) {
        //   double eq = Math.pow((centerX-pointX),2)+Math.pow((centerY-pointY),2);
        double distanceOFThePoint = distance(centerX, centerY, pointX, pointY);

        return distanceOFThePoint <= radius;
    }

    static double distance(int centerX, int centerY, int pointX, int pointY) {
        return Math.sqrt(Math.pow((centerX - pointX), 2) + Math.pow((centerY - pointY), 2));
    }


//    static boolean lengthOfTangent() {
//        return false;
//    }

//    static boolean circleInsideCircle() {
//        return false;
//    }
}