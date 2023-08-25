module com.example.admindashboard {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.admindashboard to javafx.fxml;
    exports com.example.admindashboard;
}