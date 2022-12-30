import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame f = new Frame("First Frame");

        f.setLayout(new FlowLayout());
        f.setSize(700, 300);
        f.setVisible(true);

        Button b = new Button("Tashin");
        b.setSize(20, 20);
        b.setVisible(true);
        b.setBackground(Color.orange);
        f.add(b);

        Label l = new Label("Tashin");
        f.add(l);

        TextField tF = new TextField("This is TextField");
        f.add(tF);


        TextArea t = new TextArea("Tashin", 2, 14, 1);
        f.add(t);
    }
}