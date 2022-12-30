package OOP;

public class Product {
    private final String name;
    private int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ",Price=" + price + '}';
    }
}