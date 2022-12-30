package Fall_2022.QUESTION__04;

public class Qno_04_Mid {
    public static void main(String[] args) {
        new FIFA();
        System.out.println("Argentina will win");
        new FIFA();
        System.out.println("Brazil will win");
        ArgentinaFans A = new ArgentinaFans(10, "Qatar", 2);
        BrazilFans B = new BrazilFans(7, "Qatar", 5);

        System.out.println(A.toString());
        System.out.println(B.toString());

        checkGoals(A, B);

        System.out.println(A.toString());
        System.out.println(B.toString());

    }

    public static Void checkGoals(ArgentinaFans A, BrazilFans B) {
        if (A.getNoOfGoals() > B.getNoOfGoals()) {
            A.incrementWorldCups();
        } else {
            B.incrementWorldCups();
        }
        return null;
    }


}
