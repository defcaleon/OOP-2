package com.website.brushes;


import interfaces.Brushes;
import javafx.scene.paint.Color;

import java.io.Serializable;

public class SimpleBrush implements Brushes {
    private  SerializableColor brushLineColor;
    private  SerializableColor brushFillColor;
    private  int widthPx;

    public SimpleBrush(){

    }

    public SimpleBrush(Color brushLineColor, Color brushFillColor, int widthPx) {
        this.brushLineColor = new SerializableColor(brushLineColor);
        this.brushFillColor = new SerializableColor(brushFillColor);
        this.widthPx = widthPx;
    }

    @Override
    public void setBrushLineColor(Color color) {
        this.brushLineColor=new SerializableColor(color);
    }

    @Override
    public void setBrushWidth(int widthPx) {
        this.widthPx=widthPx;
    }

    @Override
    public void setBrushFillColor(Color color) {
        this.brushFillColor=new SerializableColor(color);
    }

    @Override
    public Color getBrushLineColor() {
        return brushLineColor.getFXColor();
    }

    @Override
    public Color getBrushFillColor() {
        return brushFillColor.getFXColor();
    }

    @Override
    public int getBrushWidth() {
        return widthPx;
    }

}
