package com.website.figures;

import com.website.fmodel.Initialization;

import com.website.fmodel.Model;
import javafx.scene.canvas.GraphicsContext;
import java.util.ArrayList;

import model.Additional;
import model.Dot;
import interfaces.Brushes;
import interfaces.Lines;
public class Line implements Lines {


    public Line(){

    }

    @Override
    public void paint(GraphicsContext gc, Brushes brush, ArrayList<Dot> dots) {
        if(dots.size()<2){
            Additional.alert("need 2 cords to draw line");
            return;
        }
        Additional.gcInit(gc,brush);
        gc.strokeLine(dots.get(0).getX(),dots.get(0).getY(),dots.get(1).getX(),dots.get(1).getY());
    }

    @Override
    public boolean isMoreThan2dots() {
        return false;
    }


}
