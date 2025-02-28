public class Student {
    String name;
    int id;
    double cgpa;
    static String univerity;
    int count ;

    Student(String s,int a,double c,String u)
    {
        name = s;
        id = a;
        cgpa = c;
        univerity = u;
    }

    Student(String name,int id,double cgpa)
    {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    Student()
    {

    }

    void show()
    {
        System.out.println("Student name = "+name);
        System.out.println("Student id = "+id);
        System.out.println("Student cgpa = "+cgpa);
        System.out.println("Student univerity = "+univerity+"\n");

    }
}
