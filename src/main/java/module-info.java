import com.website.Services.BasicService;
import com.website.Services.IService;

module com.website {
    requires javafx.controls;
    requires javafx.fxml;
    requires core;


    opens com.website to javafx.fxml;
    exports com.website;
    exports com.website.Services;

    uses IService;
    provides IService with BasicService;
}