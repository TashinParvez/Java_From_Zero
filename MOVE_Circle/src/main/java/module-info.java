module com.example.move_circle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.move_circle to javafx.fxml;
    exports com.example.move_circle;
}