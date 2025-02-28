public class student extends person{
    int Student_ID;
    String Department;

    @Override
    void message() {
        super.message();
        System.out.println("------   Exam is Near");
    }

    student()
    {

    }

    public student(String name, int age, String country, int student_ID, String department) {
        super(name, age, country);
        Student_ID = student_ID;
        Department = department;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Student_ID= "+Student_ID);
        System.out.println("Department = "+Department);
    }
}
