package com.website;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class MainController {

    private final Initialization init = new Initialization();

    @FXML
    private  ComboBox<String>  figureBox;
    @FXML
    private ImageView undo;
    @FXML
    private ComboBox<Integer> brushType;

    @FXML
    public void initialize() {

        init.loadBrushTypes(brushType);
        init.loadFigures(figureBox);
    }


}
