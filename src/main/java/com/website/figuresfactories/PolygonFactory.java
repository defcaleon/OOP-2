package com.website.figuresfactories;

import com.website.figures.Polygon;
import interfaces.FigureFactory;
import interfaces.Lines;

public class PolygonFactory implements FigureFactory {
    @Override
    public Lines createFigure() {
        return new Polygon();
    }
    @Override
    public String getFigureName() {
        return "Polygon";
    }
}
