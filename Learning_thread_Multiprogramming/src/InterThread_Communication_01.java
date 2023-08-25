class C {
    int count = 0;
    boolean checker = false; // false == empty

    synchronized void get() throws InterruptedException {
        if (!checker) {
            wait();
        }
        System.out.println("Get : " + count);
        checker = false; // make filled
        notify();
    }

    synchronized void set(int count) throws InterruptedException {
        if (checker) {
            wait();
        }
        this.count = count;
        System.out.println("Set : " + count);
        checker = true; // make empty
        notify();
    }
}

class Producer {
    C obj;

    Producer(C obj) {
        this.obj = obj;
        firstThread.start();
    }

    Thread firstThread = new Thread(new Runnable() {
        @Override
        public void run() {
            int i = 0;
            while (true) {
                try {
                    obj.set(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i++;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    });
}

class Consumer {
    C obj;

    Consumer(C obj) {
        this.obj = obj;
        secondThread.start();
    }

    Thread secondThread = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    obj.get();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    });

}


public class InterThread_Communication_01 {
    public static void main(String[] args) {
        C obj = new C();
        Producer P = new Producer(obj);

        Consumer C = new Consumer(obj);
    }
}
