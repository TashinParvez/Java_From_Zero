public class Second_Implementing_Runable_Interface implements Runnable {
    @Override
    public void run() {
        while (true)
            System.out.println("tashin");
    }

    public static void main(String[] args) {
        Second_Implementing_Runable_Interface obj = new Second_Implementing_Runable_Interface();
        Thread t = new Thread(obj);
        t.start();
        t.start();

        while (true)
            System.err.println("     parveZ");
    }
}
