package com.website.figuresfactories;

import com.website.figures.Polygon;
import com.website.interfaces.Lines;

public class PolygonFactory implements FigureFactory {
    @Override
    public Lines createFigure() {
        return new Polygon();
    }
}
