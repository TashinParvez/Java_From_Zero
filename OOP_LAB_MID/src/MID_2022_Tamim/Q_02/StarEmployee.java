package MID_2022_Tamim.Q_02;

public class StarEmployee extends Employee {
    StarEmployee(String name, float salary) {
        super(name, salary);
    }

    @Override
    void printSalary() {
        System.out.println("Name " + this.name);
        System.out.println("Salary " + (this.salary + (this.salary * (double) 5 / 100)));
    }
}
