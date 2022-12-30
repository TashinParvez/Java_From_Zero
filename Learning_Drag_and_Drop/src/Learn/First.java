package Learn;

import javax.swing.*;

public class First extends JFrame {
    private JPanel mainPanel;

    First(String title)
    {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Celsius Converter");
        frame.setVisible(true);

    }
}
