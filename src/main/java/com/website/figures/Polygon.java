package com.website.figures;

import com.website.interfaces.Brushes;
import com.website.interfaces.Lines;
import com.website.model.Dot;
import com.website.model.Initialization;
import com.website.model.Model;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

public class Polygon implements Lines {
    public  Polygon(){

    }

    @Override
    public void paint(GraphicsContext gc, Brushes brush, ArrayList<Dot> dots) {
        if(dots.size()<2){
            Model.alert("need 2 cords to draw polygon");
            return;
        }
        Initialization.gcInit(gc,brush);

        double[] dotArrX = Initialization.dotArrToIntXArr(dots);
        double[] dotArrY = Initialization.dotArrToIntYArr(dots);
        gc.strokePolygon(dotArrX,dotArrY,dots.size());
        gc.fillPolygon(dotArrX,dotArrY,dots.size());
    }
}
