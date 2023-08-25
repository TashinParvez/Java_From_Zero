class CallMe2{

    // you can put synchronized before method return type to make them synchronized
    public void call(String msg) throws InterruptedException {
        System.out.print("[" + msg);
        Thread.sleep(1000);
        //System.out.println("]");
    }

    // if we make both synchronized what happens then?

    /*
    * There are three threads Hello, World, Cool
    * Hello enters call(), World, Cool --> waiting state
    * Hello leaves call() --> output: [Hello
    * World gets the Context, Cool --> waiting state
    * World enters call()
    * World leaves call() --> output: [World
    * World enters call2()
    * World leaves call2() --> output: ]
    * Hello enters call2() --> and so on
    *
    * */
    public void call2() throws InterruptedException {
        System.out.println("]");
    }
}

class Caller2 implements Runnable{
    String msg;
    final CallMe2 callMeObj;
    Thread t;

    public Caller2(String msg, CallMe2 callMeObj) {
        this.msg = msg;
        this.callMeObj = callMeObj;

        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {

            // you can write a synchronized block here
            /**
             * passing the reference to the synchronized block allows the block with such reference
             * to be executed exactly once as shown
             */
//            this.callMeObj.call(msg);
//            this.callMeObj.call2();

            synchronized (callMeObj){
                callMeObj.call(msg);
                callMeObj.call2();
            }

//
//            synchronized (callMeObj){
//                System.out.println("Testing a print here");
//            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Synchronized__SIR {
    public static void main(String[] args) {
        CallMe2 callMe = new CallMe2();
        Caller2 obj1 = new Caller2("Hello", callMe);
        Caller2 obj2 = new Caller2("World", callMe);
        Caller2 obj3 = new Caller2("Cool", callMe);
    }
}
