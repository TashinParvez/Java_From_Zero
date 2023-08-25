module com.example.tashinfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tashinfx to javafx.fxml;
    exports com.example.tashinfx;
}