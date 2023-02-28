module com.example.lifolakha {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lifolakha to javafx.fxml;
    exports com.example.lifolakha;
}