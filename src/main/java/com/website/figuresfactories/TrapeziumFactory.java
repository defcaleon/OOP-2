package com.website.figuresfactories;

import com.website.figures.Trapezium;
import interfaces.FigureFactory;
import interfaces.Lines;


public class TrapeziumFactory implements FigureFactory {
    @Override
    public Lines createFigure() {
        return new Trapezium();
    }

    @Override
    public String getFigureName() {
        return "Trapezium";
    }
}
