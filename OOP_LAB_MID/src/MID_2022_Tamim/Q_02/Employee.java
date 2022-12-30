package MID_2022_Tamim.Q_02;

abstract public class Employee {
    String name;
    float salary;

    Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }


    abstract void printSalary();

}
