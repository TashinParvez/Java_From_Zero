package Summer_2022.Q_1;

public class Q1_B {
    private static final double PI = 3.1416;

     class InnerClass {
        void calculate(double radius) {
            double area = PI * radius * radius;
            System.out.println("Area: " + area);
        }
    }

    public static void main(String[] args) {

         Q1_B.InnerClass obj = new Q1_B().new InnerClass();

        obj.calculate(12);

        //  Q1_B.InnerClass obj = new InnerClass();

   //     Q1_B.InnerClass ob1 = new Q1_B.InnerClass();


        //  Q1_B.InnerClass n = new Q1_B().new InnerClass();


//        InnerClass c = new InnerClass();
//        c.calculate();

        // InnerClass.calculate();

//        Q1_B ob = new Q1_B().new InnerClass();

//        Q1_B ob = new Q1_B();
//        ob = new InnerClass();

        Outer.Inner ob = new Outer().new Inner();

        Outer.Inner.cal();

        Outer.Inner2 ob3 = new Outer.Inner2();

    }
}


class Outer {
    class Inner {
        void calculate() {
            System.out.println("SSSSSSSSSSSSSSSSSSSS");
        }

        static void cal() {
            System.out.println("SSSSSSSSSSSSSSSSSSSS");
        }
    }

    static class Inner2 {
    }
}

