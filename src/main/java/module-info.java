module com.example.bazarlagbe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bazarlagbe to javafx.fxml;
    exports com.example.bazarlagbe;
}