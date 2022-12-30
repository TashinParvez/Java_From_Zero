package Tonni_assignment_1.Q_02;

final class Bishop {
    public static int count = 0;

    Bishop() throws BishopCreationLimitExceeded {
        count++;
        abc();
    }

    public void printObjectNumber() {
        System.out.println("This Bishop Object number is " + count + ".");
    }

    public void abc() throws BishopCreationLimitExceeded {
        try {
            if (count > 5) {
                throw new BishopCreationLimitExceeded();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class BishopCreationLimitExceeded extends Exception {
    BishopCreationLimitExceeded() {
        super("The maximum number of bishop objects can be 5");
    }

}

public class Main {
    public static void main(String[] args) throws BishopCreationLimitExceeded {
        Bishop b1 = new Bishop();
        Bishop b2 = new Bishop();
        Bishop b3 = new Bishop();
        Bishop b4 = new Bishop();
        Bishop b5 = new Bishop();
        Bishop b6 = new Bishop();

    }
}