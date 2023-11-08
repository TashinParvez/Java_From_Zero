package com.example.tashin;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class SecondSceneController extends ABC implements Initializable {
    @FXML
    private Label label1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        label1.setText(xx+"Number generated");
    }
}
