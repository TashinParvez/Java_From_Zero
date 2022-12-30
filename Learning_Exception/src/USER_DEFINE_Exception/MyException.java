package USER_DEFINE_Exception;
public class MyException extends Exception{

    @Override
    public String toString() {
        return "your balance should be mere than 10";
    }
}
