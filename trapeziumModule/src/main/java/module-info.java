import plugService.IService;
import service.Service;

module trapeziumModule{
    requires core;
    requires javafx.graphics;

    provides IService with Service;
}