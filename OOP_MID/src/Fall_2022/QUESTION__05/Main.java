package Fall_2022.QUESTION__05;

public class Main {
    public static void main(String[] args) {
        PClass pObj = new PClass();
        CClass cObj = new CClass();
        pObj.mFuc();
        cObj.mFuc();

        cObj.mFuc(10, 2.99);
        cObj.mFuc(3.145);

    }
}

//__________________ OUTPUT_____________________

//        Hellow From
//        P Class!
//        Hello Form C class!
//        Double Value:11.22
//        Double Value:2.99
//        Integer Value 10
//        Double Value:3.145
