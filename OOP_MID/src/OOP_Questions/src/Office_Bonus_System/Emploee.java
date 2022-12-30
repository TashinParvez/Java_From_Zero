package Office_Bonus_System;

public class Emploee {
    char category;
    int experience;
    private int numberOfFamilyMembers;
    private int totalFamilyIncome;

    Emploee(char category) {
        this.category = category;
    }

    Emploee() {
    }

    void setNumberOfFamilyMembers(int members) {
        this.numberOfFamilyMembers = members;
    }

    void setTotalFamilyIncome(int income) {
        this.totalFamilyIncome = income;
    }

    void elegableOrNot() {
        if ((this.experience >= 12 && this.numberOfFamilyMembers > 5) || this.totalFamilyIncome <= 1000.50)
            System.out.println("Yes, You will get Bonus");
        else if ((this.category == 'y' || this.category == 'z') && this.numberOfFamilyMembers > 8 && this.totalFamilyIncome <= 110.78) {
            System.out.println("Yes, You will get Bonus");
        } else if (this.category == 'x' && this.numberOfFamilyMembers >= 5) {
            System.out.println("Yes, You will get Bonus");
        } else
            System.out.println("Sorry, You will not get Bonus");
    }


//    public boolean equals(Emploee emploee1) {
//        return this.category == emploee1.category && this.experience == emploee1.experience && this.numberOfFamilyMembers == emploee1.numberOfFamilyMembers && this.totalFamilyIncome == emploee1.totalFamilyIncome;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emploee emploee)) return false;
        return category == emploee.category && experience == emploee.experience && numberOfFamilyMembers == emploee.numberOfFamilyMembers && totalFamilyIncome == emploee.totalFamilyIncome;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}