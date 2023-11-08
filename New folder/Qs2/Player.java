package sectionA.Qs2;

public class Player {
    int jerseyNumber;
    double salary;
    int age;
    String name;
    Player(){

    }
    Player(int jerseyNumber, double salary, int age, String name){
        this.jerseyNumber = jerseyNumber;
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    void show(Player p){
        System.out.println(p.name + "\n" + p.age + "\n" + p.jerseyNumber + "\n" + p.salary);
    }
}
