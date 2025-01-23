public class teacher extends person implements jobHolder,human {
    private String university;

    public teacher(String name, String university) {
        super(name);
        this.university = university;
    }

    public void setUniversity(String university) {
        if(university.equals("Buet"))
        {
            this.university = "Nice and Attractive";
        }
        else {
            this.university = university;
        }
    }

    @Override
    void work() {
        System.out.println("I am teacher = "+name + " from = "+university);
    }

    @Override
    void sendMessage() {
        System.out.println("Exam is near");
    }

    @Override
    public void eat() {
        System.out.println("eating...");
    }

    @Override
    public void think() {
        System.out.println("thinking...");
    }

    @Override
    public void doWork() {
        System.out.println("working...");
    }
}