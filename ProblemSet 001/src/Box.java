public class Box {
    int length=0;
    int width=0;
    int height=0;

    double getVolume() {
        return length * height * width;
    }

    void inputBoxInformations(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    void printBoxInformation() {
        System.out.println("Length " + length);
        System.out.println("Width " + width);
        System.out.println("Height " + height);
        System.out.println("Volume " + getVolume());
    }
}