public class practice5 {

    public static void main(String[] args) {

        person p = new person("Rahim",40,"BD");
        p.display();
        p.message();

        student s = new student("Imran",20,"Nepal",1234,"EEE");
        s.display();
        s.message();

        teacher t = new teacher();
        t.name = "Fahmid";
        t.age= 25;
        t.country= "BD";
        t.Student_ID = 87;
        t.Department = "CSE";
        t.salary = 1000;
        t.display();
        t.message();
    }
}
