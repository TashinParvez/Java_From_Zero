package com.example.admindashboard;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private LineChart<?, ?> linearChart;

    //  problem chart
    private void setLinearChart() {
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data("January", 10));
        series.getData().add(new XYChart.Data("February", 14));
        series.getData().add(new XYChart.Data("March", 20));
        series.getData().add(new XYChart.Data("April", 12));
        series.getData().add(new XYChart.Data("May", 12));
        series.getData().add(new XYChart.Data("June", 15));
        series.getData().add(new XYChart.Data("July", 18));
        series.getData().add(new XYChart.Data("August", 20));
        series.getData().add(new XYChart.Data("September", 4));
        series.getData().add(new XYChart.Data("October", 15));
        series.getData().add(new XYChart.Data("November", 10));
        series.getData().add(new XYChart.Data("December", 17));
        linearChart.getData().addAll(series);
    }

//    @FXML
//    private PieChart pieChart;
//
//    private void inPieChart() {
//        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
//                new PieChart.Data("Dhaka", 10),
//                new PieChart.Data("Chattogram", 10),
//                new PieChart.Data("Shylet", 10),
//                new PieChart.Data("Khulna", 10),
//                new PieChart.Data("Rajshahi", 10),
//                new PieChart.Data("Cox's Bazar", 10),
//                new PieChart.Data("Bogura", 10)
//        );
//        pieChart.setData(pieChartData);
//    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setLinearChart();
//        inPieChart();
    }
}
