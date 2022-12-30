public class  MethodOverriding {

    public void main(String[] args) {
        B obj = new B();
        obj.age();

    }
}

class  A{
    public void age()
    {
        int tashin=10;
        System.out.println(tashin);
    }
}
class  B extends A{
    @Override
    public void age()
    {
        int tashin =20;
        System.out.println(tashin);
    }
}
