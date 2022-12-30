package Fall_2021.Q_4;

public class Member {
    private String name;
    private int age;
    private String number;
    private double salary;
    private double experience;

    Member(String name, int age, String number, double salary, double experience) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.salary = salary;
        this.experience = experience;
    }

    public void getName() {
        System.out.println("Name " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getnumber() {
        System.out.println("number " + number);
    }

    public void setnumber(String number) {
        this.number = number;
    }


    public void getage() {
        System.out.println("age " + age);
    }

    public void setage(int age) {
        this.age = age;
    }

    public void getsalary() {
        System.out.println("salary " + salary);
    }

    public void setage(double salary) {
        this.salary = salary;
    }

    public double getexperience() {
        return experience;
    }

    public void setexperience(double experience) {
        this.experience = experience;
    }


}
