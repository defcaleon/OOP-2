package com.website.figuresfactories;

import com.website.figures.Ellipse;
import com.website.interfaces.Lines;

public class EllipseFactory implements FigureFactory {

    @Override
    public Lines createFigure() {
        return new Ellipse();
    }
    @Override
    public String getFigureName() {
        return "Ellipse";
    }
}
