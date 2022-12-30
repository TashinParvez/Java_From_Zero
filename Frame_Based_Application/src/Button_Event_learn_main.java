import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//class decrease implements ActionListener{
//    public void actionPerformed(ActionEvent e) {
//        thisFrame.count++;
//        thisFrame.l.setText("" + thisFrame.count);
//    }
//}

class thisFrame extends Frame implements ActionListener {
    Label l;
    Button b;
    Button b2;
    int count = 0;

    thisFrame(String title) {
        super(title);
        super.setLayout(new FlowLayout());

        l = new Label("" + count); // make count in string
        b = new Button("Increase");
        b.addActionListener(this);
        b.setVisible(true);
        b.setSize(10, 8);

//        b2 = new Button("Decrease");
//        b2.addActionListener(decrease);
//        b2.setVisible(true);
//        b2.setSize(10, 8);

        super.add(l);
        super.add(b);
//        super.add(b2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("" + count);
    }
}

public class Button_Event_learn_main {
    public static void main(String[] args) {
        thisFrame myFrame = new thisFrame("Tashin");

        myFrame.setSize(400, 400);
        myFrame.setVisible(true);
    }
}
