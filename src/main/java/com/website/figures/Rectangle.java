package com.website.figures;


import com.website.interfaces.Brushes;
import com.website.interfaces.Lines;
import com.website.model.Dot;
import com.website.model.Initialization;
import com.website.model.Model;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

public class Rectangle implements Lines {


    public  Rectangle(){
    }

    @Override
    public void paint(GraphicsContext gc, Brushes brush, ArrayList<Dot> dots) {
        if(dots.size()<2){
            Model.alert("need 2 cords to draw rectangle");
            return;
        }
        Initialization.gcInit(gc,brush);
        int width=Math.abs(dots.get(1).getX()-dots.get(0).getX());
        int height=Math.abs(dots.get(1).getY()-dots.get(0).getY());
        gc.strokeRect(dots.get(0).getX(),dots.get(0).getY(),width,height);
        gc.fillRect(dots.get(0).getX(),dots.get(0).getY(),width,height);
    }

    @Override
    public boolean isMoreThan2dots() {
        return false;
    }


}
