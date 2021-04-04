package com.website;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;


public class MainController {

    private final Initialization init = new Initialization();


    @FXML
    private Canvas canvas;

    @FXML
    private ComboBox<String> figureBox;

    @FXML
    private ComboBox<Integer> brushType;



    @FXML
    private Rectangle col1;

    @FXML
    private Rectangle col2;
    @FXML
    private ColorPicker colorBar;


    private  GraphicsContext gc;

    @FXML
    public void initialize() {

        init.loadBrushTypes(brushType);
        init.loadFigures(figureBox);
        this.gc = canvas.getGraphicsContext2D();


        /*try {

            System.out.println("aaaaaaa");

        }catch (Exception e){
            System.out.println("dsdsd");
            System.out.println(e.getMessage());
        }*/

    }


    public void color2Clicked(MouseEvent mouseEvent) {
       col2.setFill(colorBar.getValue());
    }

    public void color1Clicked(MouseEvent mouseEvent) {
        col1.setFill(colorBar.getValue());
    }
}