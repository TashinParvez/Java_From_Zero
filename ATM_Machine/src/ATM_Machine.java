import java.util.Scanner;
//  44
public class ATM_Machine {
    public static int toralMoney = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("____Automated Teller Machine____");
        System.out.println("Choose 1 for Withdraw\n" +
                "Choose 2 for Deposit\n" +
                "Choose 3 for Check Balance\n" +
                "Choose 4 for EXIT");
        int n = sc.nextInt();

        while (n != 4) {
            switch (n) {
                case 1:
                    System.out.print("how much money you want to withdraw : ");
                    int withDraw = sc.nextInt();
                    if (toralMoney < withDraw)
                        System.out.println("you dont have efficient balance");
                    else {
                        System.out.println("Now you have : " + (toralMoney - withDraw));
                        toralMoney -= withDraw;
                    }
                    break;
                case 2:
                    System.out.print("how much money you want to Deposit : ");
                    int deposite = sc.nextInt();
                    toralMoney += deposite;
                    System.out.println("Total Balance: " + (toralMoney + deposite));
                    break;
                case 3:
                    System.out.println("Total Balance: " + toralMoney);
                    break;
                default:
                    System.out.print("Please Read Instruction Carefully\nGive valid Input : ");
            }
            n = sc.nextInt();
        }

        System.out.println("\n\n Thank You For Keep Trust On US");
    }
}