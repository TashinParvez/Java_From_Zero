package First;

class Laptop implements Comparable<Laptop> {
    String name;
    int price;
    int ram;

    Laptop() {

    }

    Laptop(String name, int price, int ram) {
        this.name = name;
        this.price = price;
        this.ram = ram;
    }

    public String toString() {
        return this.name + " " + price + " " + ram;
    }

    @Override
    public int compareTo(Laptop o) {

        if (this.name.compareTo(o.name) < 0)
            return -1;
        else if (this.name.compareTo(o.name) > 0)
            return 1;
        else
            return 0;
    }
}