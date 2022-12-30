package ShababVai_Assignment;

public abstract class Animal {
    private String name;
    Animal(String name) {
        this.name = name;
    }

    abstract public void greets();
}
