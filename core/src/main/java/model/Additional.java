package model;

import interfaces.Brushes;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;

public class Additional {

    public  static void alert(String msg){

        Alert alert = new Alert(Alert.AlertType.ERROR);

        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(msg);

        alert.showAndWait();
    }

    public static void gcInit(GraphicsContext gc, Brushes brush){
        gc.setLineWidth(brush.getBrushWidth());
        gc.setStroke(brush.getBrushLineColor());
        gc.setFill(brush.getBrushFillColor());
    }
}
