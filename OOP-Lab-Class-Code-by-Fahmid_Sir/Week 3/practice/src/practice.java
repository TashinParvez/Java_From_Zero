public class practice {

    public static void main(String[] args) {
        point p = new point(5,6);
        p.display();

        point p2 = new point(2,3);
        p2.display();

        point p3 = new point(5,3);
        p3.display();

        System.out.println("\nHow many points = "+ p3.count);

        System.out.println("\np and p2 Distance = "+p.distance(p2));
        System.out.println("\np2 and p3 Distance = "+p2.distance(p3));

        circle c = new circle();
        c.center.x= 10;
        c.center.y = 5;
        c.radius = 5;

        if(c.isPointInside(p3)==1)
        {
            System.out.println("Point is Inside the circle");
        }
        else
        {
            System.out.println("Point is Outside the circle");
        }

        circle c2 = new circle(2,3,10);

        if(c.isCircleInside(c2))
        {
            System.out.println("C2 is inside c1");
        }
        else
        {
            System.out.println("C2 is outside c1");
        }
    }
}
