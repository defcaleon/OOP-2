module com.website {
    requires javafx.controls;
    requires javafx.fxml;
    requires core;

    opens com.website to javafx.fxml;
    exports com.website;

}