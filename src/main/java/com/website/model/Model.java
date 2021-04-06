package com.website.model;


import com.website.interfaces.Brushes;

import com.website.interfaces.Figures;
import com.website.interfaces.Lines;
import javafx.scene.canvas.GraphicsContext;

public class Model {

    private final Factory factory = new Factory();

    public   void start(GraphicsContext gc){

        Brushes brush = factory.createBrush("simple");
        Lines figure = factory.createFigure("line",brush);
        figure.setDots(new Dot[]{new Dot(50,50),new Dot(100,50)});
        figure.paint(gc,brush);
    }
}
