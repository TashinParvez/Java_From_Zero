public class Thread_Synchronized {
    public static void main(String[] args) throws InterruptedException {
        Counter2 tashinIsCounting = new Counter2();

        Thread obj1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++)
                    tashinIsCounting.increment();
            }
        });
        Thread obj2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++)
                    tashinIsCounting.increment();
            }
        });

        obj1.start();
        obj2.start();

        obj1.join();
        obj2.join();

        System.out.println("Count " + tashinIsCounting.count);
    }
}

class Counter2 {
    int count = 0;

    synchronized void increment() {
        count++;
    }

}
