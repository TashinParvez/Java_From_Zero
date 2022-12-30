package MID_2022_Tamim.Q_01;

public class C2 extends C1 {
    C2(String uName,char c, String uID,char cc, double uBalance, int numberOfElements) {
        super(uName, uID, uBalance, numberOfElements);
    }

    @Override
    void watchID() {
        setuBalance(getuBalance()-100);
        setNumberOfElements(getNumberOfElements()+2);
    }
}
