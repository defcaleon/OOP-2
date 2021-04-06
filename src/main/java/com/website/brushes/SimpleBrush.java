package com.website.brushes;

import com.website.interfaces.Brushes;
import javafx.scene.paint.Color;

public class SimpleBrush implements Brushes {
    private  Color brushLineColor;
    private  Color brushFillColor;
    private  int widthPx;

    public SimpleBrush(){

    }

    public SimpleBrush(Color brushLineColor, Color brushFillColor, int widthPx) {
        this.brushLineColor = brushLineColor;
        this.brushFillColor = brushFillColor;
        this.widthPx = widthPx;
    }

    @Override
    public void setBrushLineColor(Color color) {
        this.brushLineColor=color;
    }

    @Override
    public void setBrushWidth(int widthPx) {
        this.widthPx=widthPx;
    }

    @Override
    public void setBrushFillColor(Color color) {
        this.brushFillColor=color;
    }

    @Override
    public Color getBrushLineColor() {
        return brushLineColor;
    }

    @Override
    public Color getBrushFillColor() {
        return brushFillColor;
    }

    @Override
    public int getBrushWidth() {
        return widthPx;
    }
}
