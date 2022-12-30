package Fall_2022.QUESTION__05;

public class PClass {
    void mFuc() {
        System.out.println("Hellow From P Class!");
    }

    void mFuc(double d1) {
        System.out.println("Double Value : " + d1);
    }
}

class CClass extends PClass {
    void mFuc() {
        System.out.println("Hello Form C class!");
        super.mFuc(11.22);
    }

    void mFuc(int a2, double d2) {
        super.mFuc(d2);
        System.out.println("Integer Value " + a2);
    }
}
