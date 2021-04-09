module com.website {
    requires javafx.controls;
    requires javafx.fxml;
    requires undoRedo;

    opens com.website to javafx.fxml;
    exports com.website;


}