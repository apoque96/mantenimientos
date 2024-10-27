module com.example.mantenimientos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mantenimientos to javafx.fxml;
    exports com.example.mantenimientos;
}