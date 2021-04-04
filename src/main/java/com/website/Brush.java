package com.website;

import javafx.scene.paint.Color;

public interface Brush {

    void setBrushColor(Color color);
    void setBrushWidth(int widthPx);

    Color getBrushColor();
    int getBrushWidth();

    //BrushType getBrushType();
    //void setBrushType(BrushType brushType);
}
