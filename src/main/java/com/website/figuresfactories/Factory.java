package com.website.figuresfactories;

import com.website.brushes.SimpleBrush;
import com.website.figures.*;
import com.website.interfaces.Brushes;
import com.website.interfaces.Lines;


public class Factory {


    public Brushes createBrush(String typeOfBrush){
        switch (typeOfBrush){
            case "simple":{
                return  new SimpleBrush();
            }
            default: return  null;
        }
    }

    public  static  AbstractFactory getFactoryByName(String name){
        switch (name){
                case "line":{
                    return new LineFactory();
                }
                case "rectangle":{
                    return  new RectangleFactory();
                }
                case "polyline":{
                    return  new PolyLineFactory();
                }
                case"ellipse":{
                    return  new EllipseFactory();
                }
                case "polygon":{
                    return  new PolygonFactory();
                }
                default: return null;
            }
    }
}
