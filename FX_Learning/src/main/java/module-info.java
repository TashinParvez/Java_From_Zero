module com.example.fx_learning {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fx_learning to javafx.fxml;
    exports com.example.fx_learning;
}