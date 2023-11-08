import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fall_21 {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JButton b = new JButton("SWAP");
        JTextField l1 = new JTextField();
        JTextField l2 = new JTextField();
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = l1.getText();
                l1.setText(l2.getText());
                l2.setText(str);
            }
        });

        f.add(l1);
        f.add(l2);

        f.add(b);
        l1.setSize(150, 30);
        l2.setSize(150, 30);
        b.setSize(30, 30);
        b.setBounds(80, 80, 40, 20);
        f.setLayout(new FlowLayout());

        l1.setText("ABC");
        l2.setText("123");

        f.setSize(400, 400);
        f.setVisible(true);
    }
}
