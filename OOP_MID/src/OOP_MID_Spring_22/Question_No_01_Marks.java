package OOP_MID_Spring_22;

public class Question_No_01_Marks {
    String id;
    double quizMark;
    double midMark;
    double finalMark;

    public Question_No_01_Marks(String id, double quizMark, double midMark, double finalMark) {
        this.id = id;
        this.quizMark = quizMark;
        this.midMark = midMark;
        this.finalMark = finalMark;
    }

    void passedOrNot() {
        double totalMarks = finalMark + midMark + quizMark;
        if (totalMarks >= 55)
            System.out.println("Passed");
        else
            System.out.println("Failed");
    }
}

