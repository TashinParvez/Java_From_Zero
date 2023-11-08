package com.example.tashinfx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ResultController extends PlayerInfo implements Initializable {
    @FXML
    private Label resultField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (PlayerInfo.result) {
            resultField.setText(PlayerInfo.name + " YOU WIN!!!");
        } else {
            resultField.setText(PlayerInfo.name + " YOU LOST!!!");
        }
    }
}


