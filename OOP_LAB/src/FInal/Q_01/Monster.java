package FInal.Q_01;

public abstract class Monster {
    int weight;

    static int scareCounts = 0;

    abstract public void scare(Human h);

     void eat(){
         weight++;
     }

}
