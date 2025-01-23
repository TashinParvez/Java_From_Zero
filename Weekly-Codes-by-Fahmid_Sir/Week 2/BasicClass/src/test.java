public class test {

    public static void main(String[] args) {
        Point p = new Point();

        //p.setter(10,12,20);

//        p.x = 10;
//        p.y = 12;
//        p.z = 20;

        p.display();

//        System.out.println("x = "+p.x);
//        System.out.println("y = "+p.y);
//        System.out.println("z = "+p.z+"\n");

        Point p2 = new Point(3,2,4);

         //p2.setter(3,2,4);
//        p2.x = 3;
//        p2.y = 2;
//        p2.z = 4;

        p2.display();

//        System.out.println("x = "+p2.x);
//        System.out.println("y = "+p2.y);
//        System.out.println("z = "+p2.z+"\n");

        Student s = new Student("F",87,4.99,"UIU");

//        s.name = "Fahmid";
//        s.id = 87;
//        s.cgpa = 4.99;
//        s.univerity = "UIU";

//        System.out.println("Name = "+s.name);
//        System.out.println("ID = "+s.id);
//        System.out.println("Cgpa = "+s.cgpa);
//        System.out.println("Uni = "+s.univerity+"\n");

        s.show();

        Student s2 = new Student("M",80,4.89,"Brac");
        s2.show();

        System.out.println(s.univerity);

        Student s3 = new Student("A",80,4.89);
        s3.show();
    }
}
