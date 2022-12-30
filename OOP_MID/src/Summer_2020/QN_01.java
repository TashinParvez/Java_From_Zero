package Summer_2020;

import Summer_2020.PACKAGE_OF_QN_A.Animal;

public class QN_01 {
}

class Tiger extends Animal {
    String region;

    Tiger(String type, int age, String region) {
        super(type, age);
        this.region = region;
    }

    void display() {
        System.out.println("This is a" + type);
    }
}


