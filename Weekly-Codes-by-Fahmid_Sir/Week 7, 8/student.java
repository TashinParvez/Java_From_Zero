public class student extends person {
    int id;

    public student(String name, int id) {
        super(name);
        this.id = id;
    }

    void work()
    {
        System.out.println("I am student = "+ name + " and Id = "+id);
    }

    void work(String country)
    {
        System.out.println("I am student = "+ name + " and Id = "+id+" and From = "+country);
    }

    @Override
    void sendMessage() {
        System.out.println("Next day andolon");
    }
}