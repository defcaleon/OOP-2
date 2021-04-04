package com.website;

import javafx.scene.paint.Color;

public interface Figures {

    void paint(int x,int y);
    void delete();
    void copy();

    void onFocus();
    void offFocus();

    void serialize();
    void deserialize();

    void setColorBorder(Color color);
    void setColorFigure(Color color);
    void setFigureWidth(int widthPx);

    Color getColorBorder(Color color);
    Color getColorFigure(Color color);
    int getFigureWidth(int widthPx);
}
