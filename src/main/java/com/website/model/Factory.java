package com.website.model;

import com.website.brushes.SimpleBrush;
import com.website.figures.Line;
import com.website.figures.Rectangle;
import com.website.interfaces.Brushes;
import com.website.interfaces.Lines;

import java.util.ArrayList;

public class Factory {

    public Lines createFigure(String typeOfFigure, ArrayList<Dot> arrDot){
        switch (typeOfFigure){
            case "line":{
                return new Line(arrDot);
            }
            case "rectangle":{
                return  new Rectangle(arrDot);
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
