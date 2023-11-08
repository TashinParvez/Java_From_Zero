package FALL_21.Q_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GUITEST {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(275, 120);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        //   frame.setLayout(new GridLayout(2, 2));
        JTextField tf1 = new JTextField(10);
        JTextField tf2 = new JTextField(10);
        JButton b = new JButton("SWAP");
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = tf2.getText();
                tf2.setText(tf1.getText());
                tf1.setText(str);
            }
        });

        frame.add(tf1);
        frame.add(tf2);
        frame.add(b);
        frame.setVisible(true);
    }
}
