package FInal.Q_01;

public class CookieMonster extends Monster {
    int weight = 0;

    CookieMonster(int weight) {
        this.weight = weight;
    }

    @Override
    public void scare(Human h) {
        if (h.bravery.toLowerCase().equals("not brave")) {
            System.out.print("Scream");
            scareCounts++;
        }
    }

    @Override
    void eat() {
        this.weight++;
    }

    @Override
    public String toString() {
        return "weight " + weight + "\n" + "scareCounts " + scareCounts;
    }
}
