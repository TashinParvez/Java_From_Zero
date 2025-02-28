public class Point {
    int x;
    int y;
    int z;

    Point()
    {
        System.out.println("Point Object Created");
    }

    Point(int a,int b,int c)
    {
        x = a;
        y = b;
        z = c;
    }

    void  display()
    {
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        System.out.println("Z = "+z+"\n");
    }

    void  setter(int a,int b,int c)
    {
        x = a;
        y = b;
        z = c;
    }
}
