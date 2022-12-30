package HS_MID_OOP_LAB.Q_2;

abstract public class Animal {
    public int legs;
    public Animal(int legs)
    {
        this.legs=legs;
    }

    abstract void eat();

    void walk() {
        System.out.println("Animal can walk.\n Legs: "+this.legs);
    }


}
