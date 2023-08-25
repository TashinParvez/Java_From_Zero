import java.awt.*;

abstract class Conics {
    double a, b, c, d, e, f;

    Conics(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    abstract boolean whichConics();
}

class Circle extends Conics {
    double radius;
    Point center;

    Circle(double a, double b, double c, double d, double e, double f) {
        super(a, b, c, d, e, f);
        double x = (c * e - 2 * b * d) / (4 * a * b - c * c);
        double y = (c * d - 2 * a * e) / (4 * a * b - c * c);
        this.center = new Point((int) x, (int) y);
        this.radius = Math.sqrt((x - (double) d / 2) * (x - (double) d / 2) + (y - e / (double) 2) * (y - e / (double) 2) - (double) f);
    }

    boolean whichConics() {
        return true;
    }
}

class Parabola extends Conics {
    Parabola(double a, double b, double c, double d, double e, double f) {
        super(a, b, c, d, e, f);
    }

    boolean whichConics() {
        return false;
    }
}

class CT4 {

    public static void main(String[] args) {
        Circle c1 = new Circle(1, 1, 0, 4, -6, 5);
        Circle c2 = new Circle(2, 1, 0, 4, -6, 5);
        Parabola p1 = new Parabola(1, 0, 0, -2, -1, -3);

        System.out.println(c1.radius); // wrong


        System.out.println(c1.center);
        showConicsName(c1);
        showConicsName(p1);
        showConicsName(c2);

    }

    static void showConicsName(Conics c) {
        if (c.whichConics()) {
            System.out.println("geometry.Circle");
        } else if (!c.whichConics()) {
            System.out.println("geometry.Parabola");
        } else {
            System.out.println("None of them.");
        }
    }
}