module com.example.scenebuilder_add {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenebuilder_add to javafx.fxml;
    exports com.example.scenebuilder_add;
}