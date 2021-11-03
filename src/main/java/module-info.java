module com.kodilla.warcaby {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kodilla.warcaby to javafx.fxml;
    exports com.kodilla.warcaby;
}