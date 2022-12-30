package Fall_2021.Q_4;

public class Employee extends Member {
    String designation;

    Employee(String name, int age, String number, double salary, double experience, String designation) {
        super(name, age, number, salary, experience);
        this.designation = designation;
    }

    void changedesignation()
    {
        if(super.getexperience()>5)
        {
            designation ="Designation Changed";
        }
        else {
            System.out.println("designation change is not possible");
        }
    }

    String getdesignation(){
        return designation;
    }


}
