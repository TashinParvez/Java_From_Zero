public class Make_Thread_usingExtendThread extends Thread {
    String threadName;

    Make_Thread_usingExtendThread(int name) {                //constructor
        threadName = name + "";
    }

    @Override
    public void run() {
        for (int i = 0; i++ < 5; ) {
            System.out.println(i + "   thread " + threadName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Make_Thread_usingExtendThread m = new Make_Thread_usingExtendThread(1);
        Make_Thread_usingExtendThread m2 = new Make_Thread_usingExtendThread(2);
        m.start();
        try {
            m.join();
        } catch (InterruptedException e) {
        }
        m2.start();
    }
}
