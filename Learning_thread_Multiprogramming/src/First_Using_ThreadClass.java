public class First_Using_ThreadClass extends Thread {
    @Override
    public void run() {
        while (true)
            System.out.println("tashin");
    }

    public static void main(String[] args) {

        First_Using_ThreadClass thread = new First_Using_ThreadClass();
        thread.start();

        while (true)
            System.out.println("        Parvez");
    }

}