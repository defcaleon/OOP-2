package com.website.interfaces;

import javafx.scene.paint.Color;

public interface Brushes {

    void setBrushLineColor(Color color);
    void setBrushWidth(int widthPx);
    void setBrushFillColor(Color color);

    Color getBrushLineColor();
    Color getBrushFillColor();
    int getBrushWidth();




    //BrushType getBrushType();
    //void setBrushType(BrushType brushType);
}
