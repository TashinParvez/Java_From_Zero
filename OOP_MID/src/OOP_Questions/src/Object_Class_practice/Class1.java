package Object_Class_practice;

class Class1 extends School {
    public int id = 10;

    Class1() {

    }

    boolean equal(Class1 c2) {
        if (this.id == c2.id)
            return true;
        else
            return false;
    }

    void schoolName()
    {
        System.out.println("Child school");
    }
}
