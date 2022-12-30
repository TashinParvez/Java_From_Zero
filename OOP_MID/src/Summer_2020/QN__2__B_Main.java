package Summer_2020;

class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}

class Parrot extends Bird {
    void fly() {
        System.out.println("Parrot is flying");
    }

    void speak(String words) {
        System.out.println("Parrot is speaking " + words);
    }


}

public class QN__2__B_Main {
    public static void main(String[] args) {
        Bird bird = new Parrot();
        bird.fly();
        ((Parrot) bird).speak("Hello World");

    }

}
