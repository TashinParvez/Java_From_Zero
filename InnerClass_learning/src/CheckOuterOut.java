public class CheckOuterOut {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.display(); // outer display

        Outer.Inner oi = new Outer().new Inner();
        oi.y = 10;
        oi.display(); // inner display



    }
}

class Outer {
    static int x = 100;

    class Inner {
        int y = 199;

        void display() {
            System.out.println("X+Y = " + (Outer.x + y));
        }
    }

    void display() {
        Inner obj = new Inner();
        int z = obj.y;
        System.out.println(z);
        obj.display();
    }
}
