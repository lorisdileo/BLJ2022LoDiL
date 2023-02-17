module com.example.fxsample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxsample to javafx.fxml;
    exports com.example.fxsample;
}