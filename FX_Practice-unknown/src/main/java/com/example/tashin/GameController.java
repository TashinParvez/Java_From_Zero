package com.example.tashin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class GameController extends ABC{

    @FXML
    private Label attemptsNumber;

    @FXML
    private Button number;

    @FXML
    private Label numberGenerateMessage;

    @FXML
    private TextField playernameInput;

    @FXML
    private Button submit;

    @FXML
    void circle1Clicked(MouseEvent event) {

    }

    @FXML
    void circle2Clicked(MouseEvent event) {

    }

    @FXML
    void circle3Clicked(MouseEvent event) {

    }

    @FXML
    void generateNumberClicked(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("SecondScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void submitClicked(ActionEvent event) {
        name+=playernameInput.getText();
    }

    private Parent root;
    private Stage stage;
    private Scene scene;


}
