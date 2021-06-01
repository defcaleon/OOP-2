package com.website.figuresfactories;

import interfaces.Lines;

public interface FigureFactory {

    Lines createFigure();
    String getFigureName();

}
