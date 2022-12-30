package ShababVai_Assignment;

public class Cat extends Animal {
    public Cat(String Name) {
        super(Name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
