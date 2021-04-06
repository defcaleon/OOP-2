package com.website.figures;

import com.website.model.Initialization;
import com.website.model.Dot;
import com.website.interfaces.Brushes;
import com.website.interfaces.Lines;
import com.website.model.Model;
import javafx.scene.canvas.GraphicsContext;
import java.util.ArrayList;

public class Line implements Lines {

    private ArrayList<Dot> dots;

    public Line(ArrayList<Dot> arrDot){
        this.dots=arrDot;
    }


    public ArrayList<Dot> getDots() {
        return dots;
    }

    public void setDots(ArrayList<Dot> dots) {
        this.dots = dots;
    }

    @Override
    public void paint(GraphicsContext gc, Brushes brush) {
        if(dots.size()<2){
            Model.alert("need 2 cords to draw line");
            return;
        }
        Initialization.gcInit(gc,brush);
        gc.strokeLine(dots.get(0).getX(),dots.get(0).getY(),dots.get(1).getX(),dots.get(1).getY());
    }


}
