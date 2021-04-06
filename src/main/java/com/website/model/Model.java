package com.website.model;


import com.website.interfaces.Brushes;

import com.website.interfaces.Lines;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Model {

    private final Factory factory = new Factory();
    private Brushes brush;
    private Lines figure;

    public void start(GraphicsContext gc){

        this.brush = factory.createBrush("simple");
        brushStartInit(this.brush);

    }

    public void draw(GraphicsContext gc, ArrayList<Dot> dotArr, String figure){
        this.figure = factory.createFigure(figure,dotArr);
        this.figure.paint(gc,this.brush);
    }

    public  static void alert(String msg){

        Alert alert = new Alert(Alert.AlertType.ERROR);

        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(msg);

        alert.showAndWait();
    }

    private void brushStartInit(Brushes brush){
        brush.setBrushLineColor(Color.BLACK);
        brush.setBrushFillColor(Color.WHITE);
        brush.setBrushWidth(2);
    }

    public void setBrushLineColor(Color color){
        brush.setBrushLineColor(color);
    }
    public void setBrushFillColor(Color color){
        brush.setBrushFillColor(color);
    }
    public void setBrushWidth(int width){
        brush.setBrushWidth(width);
    }





}
