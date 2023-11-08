package Spring_21.Q_4;

public class B {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(0.0)
        {
          //  @Override
            void updateBalance() {
                System.out.println("UPDATED");

            }
        };

       // b.updateBalance("0");
        b.updateBalance(0);
     //   b.updateBalance();


    }
}
class BankAccount{
    double balance;
    BankAccount(double balance)
    {
        this.balance = balance;
    }
    void updateBalance(double balance){
       this.balance += balance;
    }
}
