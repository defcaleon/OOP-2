package interfaces;

import javafx.scene.paint.Color;

import java.io.Serializable;

public interface Brushes extends Serializable {

    void setBrushLineColor(Color color);
    void setBrushWidth(int widthPx);
    void setBrushFillColor(Color color);

    Color getBrushLineColor();
    Color getBrushFillColor();
    int getBrushWidth();

    //BrushType getBrushType();
    //void setBrushType(BrushType brushType);
}
