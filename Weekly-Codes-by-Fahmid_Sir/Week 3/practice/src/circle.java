public class circle {
    point center;
    double radius;

    circle()
    {
        center = new point();
    }

    circle(int a,int b, double radius)
    {
        center = new point(a,b);
        this.radius = radius;
    }


    boolean isCircleInside(circle q)
    {
        double d = center.distance(q.center);

        if(d+ q.radius <= radius) return true;
        else return false;

    }

    int isPointInside(point k)
    {
        if(center.distance(k)>radius)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

}
