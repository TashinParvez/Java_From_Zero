package com.example.admindashboard;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class EarningController implements Initializable {


    @FXML
    private LineChart<?, ?> linearChart;

    //  problem chart
    private void setLinearChart() {
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data("January", 10000));
        series.getData().add(new XYChart.Data("February", 14000));
        series.getData().add(new XYChart.Data("March", 12000));
        series.getData().add(new XYChart.Data("April", 16000));
        linearChart.getData().addAll(series);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setLinearChart();
    }
}
