package com.website.figuresfactories;

import com.website.figures.PolyLine;
import interfaces.FigureFactory;
import interfaces.Lines;

public class PolyLineFactory implements FigureFactory {

    @Override
    public Lines createFigure() {
        return new PolyLine();
    }
    @Override
    public String getFigureName() {
        return "Polyline";
    }
}
