abstract class person {
    String name;
    public person(String name) {
        this.name = name;
    }
    void work()
    {
        System.out.println("I am person = "+ name);
    }
    abstract void sendMessage();
}