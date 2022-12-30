package Fall_2021.Q3;

public class Exam {
    int id;
    double marks;
}

class Mtest {
    void testFunc1(Exam m1, Exam m2) {
        Exam temp = m1;
        m1 = m2;
        m2 = temp;
    }

    void testFunc2(Exam m1, Exam m2) {
        int temp = m1.id;
        double tempMarks = m1.marks;

        m1.id = m2.id;
        m1.marks = m2.marks;
        m2.id = temp;
        m2.marks = tempMarks;
    }

}
