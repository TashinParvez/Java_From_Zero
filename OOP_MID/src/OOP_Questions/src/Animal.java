abstract class Animal {
    public int legs;

    Animal(int legs)
    {
        this.legs=legs;
    }
    Animal() {}

    abstract void eat();
    abstract void sleep();

    void walk()
    {
        System.out.println("This animal have "+this.legs+" legs");
    }

}
