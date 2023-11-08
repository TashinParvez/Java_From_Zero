public class Employee {
     int id;
     double salary = 1000;
    int year = 8;

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }
    public  Employee()
    {

    }

    public double incrementSalary()
    {

        if(this.year>=6)
        {
            salary=(salary*15)/100;
        }
        else {
            salary = (salary * 10) / 100;
        }

        return salary;
    }



}
