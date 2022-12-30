package Exception.Exersise;

import java.util.Scanner;

public class EX_07 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int currentBalance = 0;

        while (true) {
            System.out.println("What do you want to do\n1. Cash Out\n2. Cash IN\n3. Quit\n");
            int option = sc.nextInt();
            try {
                if (option == 1) {
                    System.out.println("How much money you want to out");
                    int cashOut = sc.nextInt();
                    checkAmount(cashOut);
                    currentBalance = (currentBalance - cashOut);
                    System.out.println("Your Current Balance is " + currentBalance + "\n\n");
                } else if (option == 2) {
                    System.out.println("How much money you want to in");
                    int cashIn = sc.nextInt();
                    checkAmount(cashIn);
                    currentBalance = (currentBalance + cashIn);
                    System.out.println("Your Current Balance is " + currentBalance + "\n\n");
                } else if (option == 3) {
                    break;
                } else {
                    System.out.println("Please enter valid Input");
                }
            } catch (BankDefineException e) {
                System.out.println(e);
            }
        }

        System.out.println("Thank you for Believing us");
    }

    static void checkAmount(int amount) throws BankDefineException {
        if (amount <= 0) {
            throw new BankDefineException("\n\n------------- amount cant be 0 or negative ---------------\n\n");
        }
    }
}

class BankDefineException extends Exception {
    BankDefineException(String str) {
        super(str);
    }
}