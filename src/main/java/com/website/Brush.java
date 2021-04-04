package com.website;

import com.website.interfaces.Brushes;
import javafx.scene.paint.Color;

public class Brush implements Brushes {
    private  Color brushColor;
    private  int widthPx;

    public Brush(Color brushColor, int widthPx) {
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
