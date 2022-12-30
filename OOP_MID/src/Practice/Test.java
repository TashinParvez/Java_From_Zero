package Practice;

class Human {
    public void whoAmI() {
        System.out.println("I am a human");
    }
}

class students extends Human {
    public void whoAmI() {
        System.out.println("I am a student");
    }
}

class Grandstudents extends students {
    public void whoAmI() {
        System.out.println("I am a Grandstudents");
    }
}

public class Test {
    public static void testFun(Human h) {
        h.whoAmI();
    }

    public static void main(String[] args) {
        testFun(new Human());
        testFun(new students());
        testFun(new Grandstudents());

        Human h = new Grandstudents();
        h.whoAmI();

        students s = (students) h;
        s.whoAmI();

        Grandstudents gs = (Grandstudents) s;
        gs.whoAmI();

    }


//    void tashin(String name, int age) {
//
//    }
//
//    int tashin(double height, int age) {
//        return age;
//    }


}
