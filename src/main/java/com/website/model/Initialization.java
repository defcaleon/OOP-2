package com.website.model;

import com.website.brushes.SimpleBrush;
import com.website.interfaces.Brushes;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ComboBox;

public class Initialization {

    public  void loadBrushTypes(ComboBox<Integer> brushType){
        ObservableList<Integer> arr = FXCollections.observableArrayList(2,3,4,5,6,7,8,10,12,14,18,22,26,30,36,42,50,60,72);
        brushType.setItems(arr);
        brushType.getSelectionModel().selectFirst();
    }

    public void loadFigures(ComboBox<String> brushType){
        ObservableList<String> arr = FXCollections.observableArrayList("line","arc","square","rectangle","circle","ellipse","polygon");
        brushType.setItems(arr);
        brushType.getSelectionModel().selectFirst();
    }

    public static void gcInit(GraphicsContext gc, Brushes brush){
        gc.setLineWidth(brush.getBrushWidth());
        gc.setStroke(brush.getBrushColor());
    }
}
