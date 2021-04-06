package com.website.brushes;

import com.website.interfaces.Brushes;
import javafx.scene.paint.Color;

public class SimpleBrush implements Brushes {
    private  Color brushColor;
    private  int widthPx;

    public SimpleBrush(){

    }
    public SimpleBrush(Color brushColor, int widthPx) {
        this.brushColor = brushColor;
        this.widthPx = widthPx;
    }


    @Override
    public void setBrushColor(Color color) {
        this.brushColor=color;
    }

    @Override
    public void setBrushWidth(int widthPx) {
        this.widthPx=widthPx;
    }

    @Override
    public Color getBrushColor() {
        return brushColor;
    }

    @Override
    public int getBrushWidth() {
        return widthPx;
    }
}
