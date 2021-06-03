import Services.Service;
import com.website.Services.IService;

module trapeziumModule{
    requires com.website;
    requires core;
    requires javafx.graphics;

    provides IService with Service;


}