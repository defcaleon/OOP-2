package com.website.figuresfactories;

import com.website.figures.Rectangle;
import com.website.interfaces.Lines;

public class RectangleFactory implements FigureFactory {

    @Override
    public Lines createFigure() {
        return new Rectangle();
    }
    @Override
    public String getFigureName() {
        return "Rectangle";
    }
}
