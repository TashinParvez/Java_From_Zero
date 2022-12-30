package Fall_2021.Q_5;

public class parent {
    int i=10;
    public parent(int j)
    {
        System.out.println(i);
        j=j*2;
        this.i = j*10;
    }
}

 class child extends parent{
    child(int j )
    {
        super(j);
        System.out.println(i);
        this.i = j*20;
    }
}
