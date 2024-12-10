module com.example.rms {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rms to javafx.fxml;
    exports com.example.rms;
}