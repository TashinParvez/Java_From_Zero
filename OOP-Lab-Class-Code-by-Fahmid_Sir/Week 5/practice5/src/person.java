public class person {
    String name;
    int age;
    String country;

    void message()
    {
        System.out.println("-------     Life is good !!!");
    }

    person()
    {

    }

    public person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Age= "+age);
        System.out.println("Country = "+country);
    }
}
