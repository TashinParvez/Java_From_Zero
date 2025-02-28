public class teacher extends student{
    int salary;

    @Override
    void message() {
        super.message();
        System.out.println("------ Good Luck");
    }

    teacher()
    {

    }
    public teacher(String name, int age, String country, int student_ID, String department, int salary) {
        super(name, age, country, student_ID, department);
        this.salary = salary;
    }

    @Override
    void display() {
        super.display();
        System.out.println("salary = "+salary);
    }
}
