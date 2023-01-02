public class AnonymousClass {
    public static void main(String[] args) {
        Outerr obj = new Outerr(){
            @Override
            void display() {
                System.out.println("TAshin");
            }
        };

        obj.display();

    }
}

abstract class Outerr {
   abstract void display();
}
