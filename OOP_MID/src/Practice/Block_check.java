package Practice;

public class Block_check {
    public static void main(String[] args) {
//        Block b = new Block(700);
        Block z = new Block(),zz;
    }
}

class Block {
    int i = 10;


    Block() {
    }

    {
        System.out.println("Here block is running");
    }

    Block(int i) {
        this.i = i;
    }

    void printInfo() {
        System.out.println("printing " + i);
    }
}
