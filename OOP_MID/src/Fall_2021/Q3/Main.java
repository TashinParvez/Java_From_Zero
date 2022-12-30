package Fall_2021.Q3;

public class Main {
    public static void main(String[] args) {
        Mtest test = new Mtest();
        Exam e1 = new Exam();
        Exam e2 = new Exam();
        e1.id = 10;
        e1.marks = 70;

        e2.id = 25;
        e2.marks = 85;

        System.out.println(e1.id + "  " + e1.marks);

        test.testFunc1(e1, e2);
        System.out.println(e1.id + "  " + e1.marks);

        test.testFunc2(e1, e2);
        System.out.println(e1.id + "  " + e1.marks);

        e1 = new Exam();
        e2 = new Exam();


    }
}
