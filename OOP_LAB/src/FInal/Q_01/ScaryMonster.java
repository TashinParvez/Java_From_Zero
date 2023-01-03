package FInal.Q_01;

public class ScaryMonster extends Monster {
    //except intelligent
    int weight = 0;

    ScaryMonster(int weight) {
        this.weight = weight;

    }

    @Override
    public void scare(Human h) {
        if (!h.intelligent.equals("true")) {
            System.out.println(h.name);  // print human name
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
