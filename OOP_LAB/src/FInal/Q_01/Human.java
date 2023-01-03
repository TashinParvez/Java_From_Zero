package FInal.Q_01;

public class Human implements Animal {
    String intelligent, bravery, name;
    int weight,height;

    Human(String name, int weight, String intelligent, String bravery) {
        this.intelligent = intelligent;
        this.name = name;
        this.bravery = bravery;
        this.weight = weight;
    }

    @Override
    public String isIntelegent() {
        if (intelligent.toUpperCase().equals("high")) {
            return "true";
        } else
            return "false";
    }

    @Override
    public void expectedHeight() {
        height = weight / 2;
    }


}
