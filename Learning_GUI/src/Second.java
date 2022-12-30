import javax.swing.*;
import java.awt.*;

public class Second {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Second Work");

        myFrame.setSize(400, 450);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new FlowLayout());

        JPanel panelTop = new JPanel();
        panelTop.setBackground(Color.BLUE);
        panelTop.setSize(400, 225);
        JPanel panelBottom = new JPanel();
        panelBottom.setBackground(Color.CYAN);
        panelBottom.setSize(400, 225);

        JLabel nameLable = new JLabel("Name :");
        nameLable.setForeground(Color.white);

        JTextField getName = new JTextField(15);

        panelTop.add(nameLable);
        panelTop.add(getName);

        JButton button1 = new JButton("Enter");
        JButton button2 = new JButton("Reset");
        JButton button3 = new JButton("Continue");

        panelBottom.add(button1);
        panelBottom.add(button2);
        panelBottom.add(button3);

        myFrame.add(panelTop);
        myFrame.add(panelBottom);
        myFrame.setVisible(true);
    }
}