package Exam;

public class Cabin extends Bed {

    private int cabinWard = 100 + 50;
    double haveToPay = 0.0;

    Cabin(int ward, int daysStayed, int offerGot) {
        this.ward = ward;
        this.daysStayed = daysStayed;
        this.offerGot = offerGot;
        unitCharge();
    }

    @Override
    void unitCharge() {
        haveToPay += cabinWard;
        haveToPay += (daysStayed * costforOneDAy);

        switch (offerGot) {
            case 1:
                haveToPay = haveToPay * ((double) 20 / 100);
                break;
            case 2:
                haveToPay = haveToPay * ((double) 10 / 100);
                break;
            case 3: // employee
                haveToPay = 0.00;
                break;
            case 4:  // none
                break;
        }

    }
    @Override
    double showBill() {
        return haveToPay;
    }
}