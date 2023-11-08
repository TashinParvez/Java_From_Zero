package Make_thread_Using_Interface;

public class main {
    public static void main(String[] args) {

        OtherClass obj1 = new OtherClass(1 + "");
        Thread thread1 = new Thread(obj1);

        OtherClass obj2 = new OtherClass(2 + "");
        Thread thread2 = new Thread(obj2);


        thread1.start();
//        try {
//          //  thread1.join();
//          //  thread1.join(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        thread2.start();

//        thread1.setDaemon(true);
//        thread2.setDaemon(true);


    }
}
