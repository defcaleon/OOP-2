package com.website.model;

import com.website.brushes.SimpleBrush;
import com.website.figures.Line;
import com.website.interfaces.Brushes;
import com.website.interfaces.Figures;
import com.website.interfaces.Lines;

public class Factory {

    public Lines createFigure(String typeOfFigure,Brushes brush){
        switch (typeOfFigure){
            case "line":{
                return new Line(brush);
            }
            default: return null;
        }
    }

    public Brushes createBrush(String typeOfBrush){
        switch (typeOfBrush){
            case "simple":{
                return  new SimpleBrush();
            }
            default: return  null;
        }
    }
}
