package com.website.model;


import com.website.brushes.SimpleBrush;
import com.website.brushfactories.BrushFactory;
import com.website.figuresfactories.FigureFactory;
import com.website.figuresfactories.LineFactory;
import com.website.interfaces.Brushes;

import com.website.interfaces.Lines;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Model {

    ArrayList<Lines> figureArr;

    private FigureFactory fabric;
    private BrushFactory brushFabric;

    private Brushes brush;
    private final Brushes whiteBrush = new SimpleBrush();

    public void start(GraphicsContext gc){

        fabric =  new LineFactory();
        this.brushFabric=Initialization.getBrushByName("simple");
        assert brushFabric != null;
        this.brush = brushFabric.createBrush();
        brushStartInit(this.brush);
        Initialization.whiteBrushInit(whiteBrush);

    }

    public void setFabric(FigureFactory fabric) {
        this.fabric = fabric;
    }

    public void draw(GraphicsContext gc, ArrayList<Dot> dotArr, String figure){


        assert fabric != null;
        Lines figure1 = fabric.createFigure();
        figure1.paint(gc,this.brush,dotArr);
        dotArr.clear();
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
