package MID_2022_Tamim.Q_02;

public class SuperStarEmployee extends Employee {
    SuperStarEmployee(String name, float salary) {
        super(name, salary);
    }

    @Override
    void printSalary() {
        System.out.println("Name " + this.name);
        System.out.println("Salary " + (this.salary + (this.salary * (double) 10 / 100)));
    }
}
