package OOP_MID_SUMMER_22;

public class Question_NO__3__A__InitBlock {
    public static void main(String[] args) {
        Mid obj1 = new Mid(30);
        System.out.println("@End=" + obj1.x);
    }
}

class Mid {
    int x = 10;

    //________________________________static Block
    {
        x = 20;
        System.out.println("@Block=" + x);
    }

    Mid(int x1, int x2) {
        x = x1 + x2;
        System.out.println("@Constructor-2=" + x);
    }

    Mid(int x1) {
        this(100, 200);
        x = x1;
        System.out.println("@Constructor-1=" + x);
    }

    Mid() {
        this(50);
        x = 30;
        System.out.println("@Constructor-0=" + x);
    }
}
