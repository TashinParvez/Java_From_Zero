public class Spider extends Animal {
    Spider()
    {
        super(8);
    }
    void sleep()
    {

    }

    @Override
    void eat() {
        System.out.println("No sound while eating");
    }
    void buildHouse()
    {
        System.out.println("By ther own");
    }
}