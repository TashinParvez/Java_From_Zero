public class point2D {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void display()
    {
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }
}
