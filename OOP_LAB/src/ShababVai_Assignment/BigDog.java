package ShababVai_Assignment;

public class BigDog extends Dog {
    BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("WOOOo");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("woooooow");
    }

    public void greets(BigDog another) {
        System.out.println("woooooooow");
    }

}
