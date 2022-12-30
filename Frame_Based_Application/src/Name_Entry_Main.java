import java.awt.*;

public class Name_Entry_Main {
    public static void main(String[] args) {

        Frame nameFrame = new Frame("Name Entry");

        nameFrame.setLayout(new FlowLayout());

        Label askName = new Label("Name:");
        nameFrame.add(askName);

        TextField entryname = new TextField("Tashin");
        nameFrame.add(entryname);

        Button ok = new Button("OK");
        nameFrame.add(ok);

        nameFrame.setVisible(true);
        nameFrame.setSize(500, 500);
    }
}
