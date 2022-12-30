import java.awt.*;

public class Name_Entry_GY_Main {
    public static void main(String[] args) {
        MyFrame my = new MyFrame();
        my.setVisible(true);
        my.setSize(400, 400);
    }
}

class MyFrame extends Frame {
    Label l;
    TextField t;
    Button b;

    public MyFrame() {
        super("Name Entry");
        super.setLayout(new FlowLayout());

        l = new Label("Enter your Name");
        t = new TextField("Tashin");
        b = new Button("OK");

        super.add(l);
        super.add(t);
        super.add(b);
    }
}