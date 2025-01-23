public class Main {
    public static void main(String[] args) {
//        person p1 = new person("Shakib");
//        p1.work();
//        person p2 = new person("Tamim");
//        p2.work();

        student s1 = new student("A",1);
        s1.work();
        s1.sendMessage();
        student s2 = new student("B",2);
        s2.work("Bangladesh");

        teacher t1 = new teacher("F","UIU");
        //t1.university = "BRAC";
        t1.setUniversity("NSU");
        t1.work();
        t1.sendMessage();
        t1.eat();
        t1.doWork();
        t1.think();
        t1.salaryShow();
        System.out.println("A = " + t1.a);

        person p3 = new student("C",3);
        p3.work();
        p3.sendMessage();

        person p4 = new teacher("F","UIU");
        p4.work();
        p4.sendMessage();

    }
}