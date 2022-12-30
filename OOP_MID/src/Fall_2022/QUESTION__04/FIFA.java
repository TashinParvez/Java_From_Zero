package Fall_2022.QUESTION__04;

public class FIFA {
    private int noOfGoals;
    private String venue;

    public FIFA() {
        System.out.println("Who will be Winner?");
    }

    public FIFA(int noOfGoals, String venue) {
        this.venue = venue;
        this.noOfGoals = noOfGoals;
    }

    @Override
    public String toString() {
        return "FIFA -> NoOfGoals : " + noOfGoals + ", Venue :" + venue;
    }

    public int getNoOfGoals() {
        return noOfGoals;
    }

    public String getVenue() {
        return venue;
    }
}
