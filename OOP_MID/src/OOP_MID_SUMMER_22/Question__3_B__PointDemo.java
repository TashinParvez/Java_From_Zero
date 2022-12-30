package OOP_MID_SUMMER_22;

public class Question__3_B__PointDemo {

    void resetPoint1(Point p) {
        p = new Point(0, 0);
    }

    void resetPoint2(Point p) {
        p.x = 0;
        p.y = 0;
    }

    public static void main(String[] args) {

        Point p1 = new Point(3, 5);
        Point p2 = new Point(10, 15);

        Question__3_B__PointDemo demo = new Question__3_B__PointDemo();
        demo.resetPoint1(p1);

        System.out.println("(" + p1.x + ", " + p1.y + ")     24 line output"); // Question (i)

        demo.resetPoint2(p2);
        System.out.println("(" + p2.x + ", " + p2.y + ")     26 line output"); // Question (i)
        p2 = new Point(9, 9); // Question (ii)
    }
}


class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}