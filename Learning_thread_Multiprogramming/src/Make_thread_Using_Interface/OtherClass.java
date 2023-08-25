package Make_thread_Using_Interface;

public class OtherClass implements Runnable {
    String name;

    OtherClass(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i < 6; i++) {
            System.out.println(i + " thread " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if ((1 + "").equals(name) && i == 1) {
                try {
                    Thread.sleep(4000);
                    System.out.println("Thread " + name + " is Sleeping");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        System.out.println("thread " + name + " is finish");
    }
}
