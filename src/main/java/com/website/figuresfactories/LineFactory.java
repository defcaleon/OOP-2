package com.website.figuresfactories;

import com.website.figures.Line;
import interfaces.FigureFactory;
import interfaces.Lines;

public class LineFactory implements FigureFactory {

    @Override
    public Lines createFigure() {
        return new Line();
    }
    @Override
    public String getFigureName() {
        return "Line";
    }
}
