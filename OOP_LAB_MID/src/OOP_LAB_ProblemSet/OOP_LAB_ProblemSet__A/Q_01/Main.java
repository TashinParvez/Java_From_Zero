package OOP_LAB_ProblemSet.OOP_LAB_ProblemSet__A.Q_01;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(12, 12, 3);
        Box b2 = new Box(12, 11, 32);
        System.out.println("box 1 volume : " + b1.getVolume());
        System.out.println("box 2 volume : " + b2.getVolume());
    }
}
