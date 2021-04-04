package com.website.interfaces;

import javafx.scene.paint.Color;

public interface Brushes {

    void setBrushColor(Color color);
    void setBrushWidth(int widthPx);

    Color getBrushColor();
    int getBrushWidth();



    //BrushType getBrushType();
    //void setBrushType(BrushType brushType);
}
