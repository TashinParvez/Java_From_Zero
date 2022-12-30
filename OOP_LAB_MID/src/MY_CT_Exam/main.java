package Exam;

import java.util.Scanner;

class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nChoose a option (ENTER INTEGER NUMBER ONLY)");
        System.out.println("1. General\n2. Cabin\n3. ICU\n4. CCU\n"); // different charges
        int n = sc.nextInt();

        switch (n) {
            case 1:
                Bed newPatient = new General(Bed.selectWard(), Bed.numberOfDaysStayed(), Bed.forOffer());
                // System.out.println("\n\n------------> you have to pay total : " + newPatient.haveToPay + "TAKA\n\n");
                calculateBill(newPatient);
                break;
            case 2:
                Bed cabinPatient = new Cabin(Bed.selectWard(), Bed.numberOfDaysStayed(), Bed.forOffer());
                // System.out.println("\n\n------------> you have to pay total : " + cabinPatient.haveToPay + "TAKA\n\n");
                calculateBill(cabinPatient);
                break;
            case 3:
                Bed icuPatient = new ICU(Bed.selectWard(), Bed.numberOfDaysStayed(), Bed.forOffer());
                // System.out.println("\n\n------------> you have to pay total : " + icuPatient.haveToPay + "TAKA\n\n");
                calculateBill(icuPatient);
                break;
            case 4:
                Bed ccuPatient = new CCU(Bed.selectWard(), Bed.numberOfDaysStayed(), Bed.forOffer());
                // System.out.println("\n\n------------> you have to pay total : " + ccuPatient.haveToPay + "TAKA\n\n");
                calculateBill(ccuPatient);
                break;

        }


        main(new String[12]); //______________ for infinity loop
    }

    static void calculateBill(Bed obj) {
        System.out.println("\n\n------------> you have to pay total : " + obj.showBill() + " TAKA\n\n");
        // return obj.showBill();
    }

}