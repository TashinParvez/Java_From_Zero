module com.example.learning_java_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.learning_java_fx to javafx.fxml;
    exports com.example.learning_java_fx;
}