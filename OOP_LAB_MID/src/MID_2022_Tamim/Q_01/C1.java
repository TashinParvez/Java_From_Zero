package MID_2022_Tamim.Q_01;

public class C1 {
    String uName;
    String uID;
    private double uBalance;
    private int numberOfElements;

    public double getuBalance() {
        return uBalance;
    }

    public void setuBalance(double uBalance) {
        this.uBalance = uBalance;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    C1(String uName, String uID, double uBalance, int numberOfElements) {
        this.uBalance = uBalance;
        this.uID = uID;
        this.uBalance = uBalance;
        this.numberOfElements = numberOfElements;
    }

    void updateID(String uID) {
        this.uID = uID;
    }

    void updateName(String uName) {
        this.uName = uName;
    }
    void watchID() {
        uBalance -= 50;
        numberOfElements++;
    }


}
