module com.example.cs301_weekone {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cs301_weekone to javafx.fxml;
    exports com.example.cs301_weekone;
}