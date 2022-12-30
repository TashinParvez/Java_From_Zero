package Fall_2022.QUESTION__04;

public class BrazilFans extends FIFA {
    private int havingWorldCups;

    BrazilFans(int noOfGoals, String venue, int havingWorldCups) {
        super(noOfGoals, venue);
        this.havingWorldCups = havingWorldCups;
    }

    @Override
    public String toString() {
        return "BrazilFans -> [FIFA -> NoOfGoals : " + super.getNoOfGoals() + ", Venue :" + super.getVenue() + "], HavingWorldCups: " + havingWorldCups;
    }

    void incrementWorldCups() {
        havingWorldCups++;
    }
}
