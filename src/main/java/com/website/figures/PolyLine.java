package com.website.figures;

import model.Additional;
import model.Dot;
import interfaces.Brushes;
import interfaces.Lines;
import com.website.fmodel.Initialization;
import com.website.fmodel.Model;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

public class PolyLine implements Lines {

    @Override
    public void paint(GraphicsContext gc, Brushes brush, ArrayList<Dot> dots) {
        if(dots.size()<2){
            Additional.alert("need more than 2 cords to draw polyline");
            return;
        }
        Additional.gcInit(gc,brush);
        double[] dotArrX = Initialization.dotArrToIntXArr(dots);
        double[] dotArrY = Initialization.dotArrToIntYArr(dots);
        gc.strokePolyline(dotArrX,dotArrY,dots.size());
    }

    @Override
    public boolean isMoreThan2dots() {
        return true;
    }
}
