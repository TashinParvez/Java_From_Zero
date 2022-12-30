import javax.swing.*;
import java.awt.*;

public class First {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Tashin's First GUI Application");
        myFrame.setVisible(true);
        myFrame.setSize(400, 450);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton okButton = new JButton("Ok");
        okButton.setBackground(Color.BLACK);
        okButton.setForeground(Color.ORANGE);
     //   myFrame.add(okButton);

//        Container contain = myFrame.getContentPane();
//        contain.add(okButton);

        JPanel myPanel = new JPanel();
        myPanel.setBackground(Color.CYAN);
        myPanel.setSize(400,225);
        myPanel.add(okButton);
        myFrame.add(myPanel);

    }
}
