package com.website.figures;

import com.website.model.Initialization;
import com.website.brushes.SimpleBrush;
import com.website.model.Dot;
import com.website.interfaces.Brushes;
import com.website.interfaces.Lines;
import javafx.scene.canvas.GraphicsContext;

public class Line implements Lines {

    private Brushes brush;
    private Dot[] dots;

    public Brushes getBrush() {
        return brush;
    }

    public void setBrush(Brushes brush) {
        this.brush = brush;
    }

    public Dot[] getDots() {
        return dots;
    }

    public void setDots(Dot[] dots) {
        this.dots = dots;
    }

    public Line(Brushes brush){
        this.brush=brush;
    }
    public Line(GraphicsContext gc, SimpleBrush simpleBrush) {

    }

    @Override
    public void paint(GraphicsContext gc, Brushes brush) {
        Initialization.gcInit(gc,brush);
        gc.strokeLine(dots[0].getX(),dots[0].getY(),dots[1].getX(),dots[1].getY());
    }


}
