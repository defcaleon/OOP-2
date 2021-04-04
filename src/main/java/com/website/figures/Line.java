package com.website.figures;

import com.website.Brush;
import com.website.Dot;
import com.website.Initialization;
import com.website.interfaces.Brushes;
import com.website.interfaces.Lines;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line implements Lines {

    private Brush brush;
    private GraphicsContext gc;

    private Dot start;
    private Dot end;

    public Brush getBrush() {
        return brush;
    }

    public void setBrush(Brush brush) {
        this.brush = brush;
    }

    public GraphicsContext getGc() {
        return gc;
    }

    public void setGc(GraphicsContext gc) {
        this.gc = gc;
    }

    public Dot getStart() {
        return start;
    }

    public void setStart(Dot start) {
        this.start = start;
    }

    public Dot getEnd() {
        return end;
    }

    public void setEnd(Dot end) {
        this.end = end;
    }

    public Line(GraphicsContext gc, Brush brush) {
        this.brush=brush;
        this.gc=gc;
    }

    @Override
    public void paint(GraphicsContext gc, Brushes brush) {
        //Initialization.gcInit(gc,brush);
        gc.strokeLine(start.getX(),start.getY(),end.getX(),end.getY());
    }

    @Override
    public void delete() {

    }

    @Override
    public void copy() {

    }

    @Override
    public void onFocus() {

    }

    @Override
    public void offFocus() {

    }

    @Override
    public void serialize() {

    }

    @Override
    public void deserialize() {

    }

}
