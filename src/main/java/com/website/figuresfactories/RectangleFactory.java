package com.website.figuresfactories;

import com.website.figures.Rectangle;
import interfaces.FigureFactory;
import interfaces.Lines;

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
