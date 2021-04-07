package com.website.figuresfactories;

import com.website.figures.Rectangle;
import com.website.interfaces.Lines;

public class RectangleFactory implements  AbstractFactory {

    @Override
    public Lines createFigure() {
        return new Rectangle();
    }
}
