package MID_2022_Tamim.Q_02;

public class Main {
    public static void main(String[] args) {
        SuperStarEmployee ssE = new SuperStarEmployee("Mirza", 100000);
        ssE.printSalary();

        System.out.println("\n\n");

        StarEmployee starE = new StarEmployee("Tamim", 100000);
        starE.printSalary();
    }
}
