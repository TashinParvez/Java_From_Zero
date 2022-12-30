package OOP_MID_SUMMER_22.QUESTION_01___americanSuperhero;

public class SpiderMan {
    String movieName;
    String directedBy;

    public SpiderMan(String movieName, String directedBy) {
        this.movieName = movieName;
        this.directedBy = directedBy;
    }

    void show() {
        System.out.println("movieName : " + movieName);
        System.out.println("directedBy : " + directedBy);
    }


}
