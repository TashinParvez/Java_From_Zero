module com.example.tashin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tashin to javafx.fxml;
    exports com.example.tashin;
}