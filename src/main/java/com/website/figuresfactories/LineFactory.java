package com.website.figuresfactories;

import com.website.figures.Line;
import com.website.interfaces.Lines;

public class LineFactory implements AbstractFactory {

    @Override
    public Lines createFigure() {
        return new Line();
    }
}
