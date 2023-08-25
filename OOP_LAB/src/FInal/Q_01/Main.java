package FInal.Q_01;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Jon", 70, "medium", "brave");
        Human human2 = new Human("Sam", 100, "high", "not brave");


        CookieMonster coo = new CookieMonster(100);
        coo.scare(human1);
        coo.scare(human2);
        coo.eat();
        System.out.println("\n" + coo.toString());


        ScaryMonster doggo = new ScaryMonster(500);
        doggo.eat();
        doggo.scare(human1);
        doggo.scare(human2);
        System.out.println("\n" + doggo.toString());

    }
}
