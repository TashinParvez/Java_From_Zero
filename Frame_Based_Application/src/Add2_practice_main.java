import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class pFrame extends Frame implements ActionListener {
    Button b;
    Label l;
    int count = 0;

    pFrame(String title) {
        super(title);
        super.setLayout(new FlowLayout());

        l = new Label("" + count);
        b = new Button("Increase 2");
        b.addActionListener(this);

        super.add(l);
        super.add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count += 2;
        l.setText("" + count);
    }
}

public class Add2_practice_main {
    public static void main(String[] args) {
        pFrame frame = new pFrame("Increase By 2");
        frame.setVisible(true);
        frame.setSize(400, 400);
    }
}