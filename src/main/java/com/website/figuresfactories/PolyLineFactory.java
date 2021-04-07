package com.website.figuresfactories;

import com.website.figures.PolyLine;
import com.website.interfaces.Lines;

public class PolyLineFactory implements  AbstractFactory{

    @Override
    public Lines createFigure() {
        return new PolyLine();
    }
}
