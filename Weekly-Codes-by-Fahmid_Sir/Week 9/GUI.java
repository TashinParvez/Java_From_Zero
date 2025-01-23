import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame jF = new JFrame();

    JLabel userName = new JLabel();
    JLabel passValue = new JLabel();
    JTextField userTextFeild = new JTextField();
    JTextField passTextFeild = new JTextField();
    JButton button = new JButton();

    JLabel result = new JLabel();

    void GUI() {
        jF.add(userName);
        jF.add(passValue);
        jF.add(userTextFeild);
        jF.add(passTextFeild);
        jF.add(button);
        jF.add(result);

        userName.setBounds(100, 100, 100, 50);
        userName.setText("User Name");

        userTextFeild.setBounds(250, 100, 200, 50);
        //userTextFeild.setText("Example - Fahmid");

        passValue.setBounds(100, 200, 100, 50);
        passValue.setText("User Pass");

        passTextFeild.setBounds(250, 200, 200, 50);
        //passTextFeild.setText("Example - 123");

        button.setBounds(200, 300, 100, 50);
        button.setText("Login");

        result.setBounds(200, 380, 200, 50);

        button.addActionListener(this);

        jF.setLocation(100, 100);
        jF.setSize(500, 500);
        jF.setLayout(null);
        jF.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            System.out.println("Name = "+ userTextFeild.getText());
            System.out.println("Pass = "+ passTextFeild.getText());

            if(userTextFeild.getText().equals("admin")&&passTextFeild.getText().equals("1234"))
            {
                result.setText("Login succesfull");
            }
            else
            {
                result.setText("Aha, Wrong .. Try Again .. ");
            }
        }

    }
}