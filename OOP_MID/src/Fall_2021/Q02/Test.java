package Fall_2021.Q02;

public class Test {
    public static void main(String[] args) {
        Electronics els;
        els = new Electronics();

        els.printInfo();
        els = new Mobile();

        els.printInfo();
        els = new Laptop();

        els.printInfo();
        els = new SmartWatch();
        els.printInfo();
    }
}
