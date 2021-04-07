package com.website.figuresfactories;

import com.website.figures.Ellipse;
import com.website.interfaces.Lines;

public class EllipseFactory implements  AbstractFactory {

    @Override
    public Lines createFigure() {
        return new Ellipse();
    }
}
