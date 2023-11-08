package Spring_21.Q_3;

public class Code_1 {
    int a;
    static int b;
    static int c;

    public static void main(String[] args) {
        Code_1 n = new Code_1();
        n.first();
    }

   static void second() {
        System.out.println("B = " + b);
        System.out.println("C = " + c);
    }


    void first() {
        this.a = 5;
    }
}
