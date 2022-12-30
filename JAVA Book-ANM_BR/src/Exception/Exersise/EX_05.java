package Exception.Exersise;

public class EX_05 {
    public static void main(String[] args) throws Exception {
        try {
            methodA();
            doNotCallMe();
            methodB();
        } catch (XyzException e) {
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("Inside Finally Block");
        }
        System.out.println("End of th main method");
    }

    static void methodA() {
        System.out.println("Inside method A");
    }

    static void methodB() throws XyzException {
        System.out.println("inside method B");
        throw new XyzException();
    }

    static void doNotCallMe() throws Exception {
        throw new Exception("You can't call this method");
    }
}

class XyzException extends Exception {

}
