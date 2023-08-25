package FInal.Limon_Q1;

class Monster {
    int weight;
    static int scareCount = 0;

    public void eat() {
        weight++;
    }

    public void eat(Human h) {
        weight++;
    }

    public void scare() {
        scareCount++;
    }
}

class Human implements Animal {
    String intelligence;
    String bravery;
    String name;
    int weight;

    public Human(String name, int weight, String intelligence, String bravery) {
        this.intelligence = intelligence;
        this.bravery = bravery;
        this.name = name;
        this.weight = weight;
    }

    public Human() {
    }

    boolean intelligenceXX;

    @Override
    public boolean isIntelligent() {
        if (intelligence == "high") {
            intelligenceXX = true;
        } else {
            intelligenceXX = false;
        }
        return intelligenceXX;
    }

    @Override
    public int expectedHeight() {

        return weight / 2;
    }
}

interface Animal {

    public default boolean isIntelligent() {
        return false;
    }

    public default int expectedHeight() {
        return 0;
    }
}

class CookieMonster extends Monster {
    CookieMonster(int weight) {
        this.weight = weight;
    }

    public void scare(Human h) {
        if (h.bravery == "not brave") {
            scareCount++;
            System.out.println("Oh My GOD..!!!");
        }
    }
}

class ScaryMonster extends Monster {
    ScaryMonster(int weight) {
        this.weight = weight;
    }

    public void scare(Human h) {
        if (!h.isIntelligent()) {
            scareCount++;
            System.out.println(h.name + " is scared");
        }
    }
}


public class MainClass {
    public static void main(String[] args) {
        Human human1 = new Human("Jon", 70, "medium", "brave");
        Human human2 = new Human("Sam", 100, "high", "not brave");

        CookieMonster coo = new CookieMonster(100);
        coo.scare(human1);
        coo.scare(human2);
        coo.eat();
        System.out.println(coo);

        ScaryMonster doggo = new ScaryMonster(500);
        doggo.eat();
        doggo.eat(human1);
        doggo.eat(human2);
        System.out.println(doggo);

    }
}
