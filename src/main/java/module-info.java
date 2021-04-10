module com.website {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.website to javafx.fxml;
    exports com.website;



}