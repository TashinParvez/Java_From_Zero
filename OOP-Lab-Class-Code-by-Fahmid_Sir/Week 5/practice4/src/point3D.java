public class point3D extends point2D{

    private int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    void display()
    {
        super.display();
        System.out.println("Z = "+z);

    }
}
