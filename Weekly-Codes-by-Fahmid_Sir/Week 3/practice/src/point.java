public class point {
    int x;
    int y;
    static int count;

    double distance(point pp)
    {
        return Math.sqrt((x-pp.x)*(x-pp.x)+ (y-pp.y)*(y-pp.y));
    }

    point()
    {

    }

    point(int a,int b)
    {
        x = a;
        y = b;
        count++;
    }

    void display()
    {
        System.out.println("\nX = "+ x);
        System.out.println("Y = "+ y);

    }

    static void display2()
    {
        System.out.println("Hello from Static");
    }

    int pointCount()
    {
        return count;
    }
}
