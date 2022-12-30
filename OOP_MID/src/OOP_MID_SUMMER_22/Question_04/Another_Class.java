package OOP_MID_SUMMER_22.Question_04;

public class Another_Class {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setHeight(10);
        p1.setweight(10);
        p1.masureBMI();



        Person[] personList = new  Person[3];
        for (Person p: personList) {
            p = new Person();
        }

    }
}
