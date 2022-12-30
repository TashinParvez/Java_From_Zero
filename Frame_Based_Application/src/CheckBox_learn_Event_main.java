import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class fframe extends Frame implements ItemListener {
    Label l;
    Checkbox c1, c2, c3;
    String lableText = "No item is slected";

    fframe(String title) {
        super(title);
        super.setLayout(new FlowLayout());

        l = new Label(lableText);
        l.setVisible(true);
        c1 = new Checkbox(" java");
        c2 = new Checkbox(" C");
        c3 = new Checkbox(" Python");

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        super.add(l);
        super.add(c1);
        super.add(c2);
        super.add(c3);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        lableText = "";
        if (c1.getState())
            lableText += c1.getLabel();
        if (c2.getState())
            lableText += c2.getLabel();
        if (c3.getState())
            lableText += c3.getLabel();

        if (lableText.isEmpty())
            lableText = "No item is slected";

        l.setText(lableText);
    }
}

public class CheckBox_learn_Event_main {
    public static void main(String[] args) {
        fframe myframe = new fframe("Checkbox");
        myframe.setVisible(true);
        myframe.setSize(400, 400);
    }
}