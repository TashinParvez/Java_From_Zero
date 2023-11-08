package com.example.tashinfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;
import java.util.Random;

public class HomePageController extends Random {

    @FXML
    private Label attampLable;

    @FXML
    private Button generateButton;

    @FXML
    private Label messageField;

    @FXML
    private TextField nameField;

    @FXML
    private Circle numberOne;

    @FXML
    private Circle numberThree;

    @FXML
    private Circle numberTwo;

    Parent root;
    Stage stage;
    Scene scene;


    void nextpage(MouseEvent event) throws Exception
    {
        root = FXMLLoader.load(getClass().getResource("Result.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // --------------------------------------------------------------------------------------------------------------
    @FXML
    void clickedInOne(MouseEvent event) throws Exception {

        if (PlayerInfo.answer == 1) {
            // player won
            System.out.println("Player Win");
            PlayerInfo.result = true;
            nextpage(event);
        } else {
            if (attampLable.getText().equals("1")) {
                // player loose
                System.out.println("Player Lost");
                nextpage(event);

            } else {
                attampLable.setText("1");
            }
        }
    }

    @FXML
    void clickedInTwo(MouseEvent event) throws Exception {
        if (PlayerInfo.answer == 2) {
            // player won
            System.out.println("Player Win");
            PlayerInfo.result = true;
            nextpage(event);

        } else {
            if (attampLable.getText().equals("1")) {
                // player loose
                System.out.println("Player Lost");
                nextpage(event);

            } else {
                attampLable.setText("1");
            }
        }
    }

    @FXML
    void clickedInThree(MouseEvent event) throws Exception{
        if (PlayerInfo.answer == 3) {
            // player won
            System.out.println("Player Win");
            PlayerInfo.result = true;
            nextpage(event);


        } else {
            if (attampLable.getText().equals("1")) {
                // player loose
                System.out.println("Player Lost");
                nextpage(event);
            } else {
                attampLable.setText("1");
            }
        }
    }

    // --------------------------------------------------------------------------------------------------------------


    @FXML
    void generateNumber(MouseEvent event) {
        int number = new Random().nextInt(3);
        PlayerInfo.answer = number + 1;
         System.out.println("ANSWER " + PlayerInfo.answer);
        messageField.setText("Your number is Generated. Guess the Number and select the proper Circle");

    }

    @FXML
    void nameSubmit(MouseEvent event) {
        PlayerInfo.name = PlayerInfo.name + nameField.getText();
        // System.out.println(PlayerInfo.name);
    }

}
