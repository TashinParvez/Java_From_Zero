class StudentInformation{
    String name;
    String id;
    String col;

    public StudentInformation(String name) {
        this.name=name;
    }
    public StudentInformation(String name,String id) {
       this(name);
        this.id=id;
    }

    public StudentInformation(String id,String name,String col)
    {
        this.id=id;
    }
}

public class CodeDuplication {
    public static void main(String[] args)
    {
        StudentInformation s1 = new StudentInformation("TAshin","22");

        System.out.println(s1.name);
        System.out.println(s1.id);

    }
}
