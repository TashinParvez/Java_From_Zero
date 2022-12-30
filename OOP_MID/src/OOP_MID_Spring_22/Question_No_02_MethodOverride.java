package OOP_MID_Spring_22;

public class Question_No_02_MethodOverride {
    public static void main(String[] args) {
        Base bObj = new Base();
        bObj.setb(12.1);
        System.out.println(bObj.getb());
    }
}


//________________________________ Base Class

class Base {
    public int a;
    private double b;

    double getb() {
        return this.b;
    }

    void setb(double b) {
        this.b = b;
    }

    Base(int a, double b) {
        this.a = a;
        this.b = b;
    }

    Base(Base obj) {
        a = obj.a;
        b = obj.b;
    }

    Base() {

    }

    void show() {
        System.out.println("Sum of Variables In the base class " + a + b);
    }

}

// ____________________________________ Override Class
class Override extends Base {
    int c;

    Override(int a, double b, int c) {
        super(a, b);
        this.c = c;
    }

    @java.lang.Override
    void show() {
        System.out.println("Sum of Variables In the base class " + a + super.getb() + c);
    }

}


//________________________________ Override Class 2
class Override2 extends Base {

    Override2(int a, double b) {
        super(a, b);
    }

    Override2(Override2 obj) {
        super((Base) obj);
    }

    @java.lang.Override
    void show() {
        System.out.println("Sum of Variables (a+b) " + a + super.getb());
    }
}