package com.website.figures;

import com.website.interfaces.Brushes;
import com.website.interfaces.Lines;
import com.website.fmodel.Dot;
import com.website.fmodel.Initialization;
import com.website.fmodel.Model;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

public class Ellipse implements Lines {

    public  Ellipse(){}

    @Override
    public void paint(GraphicsContext gc, Brushes brush, ArrayList<Dot> dots) {
        if(dots.size()<2){
            Model.alert("need 2 cords to draw rectangle");
            return;
        }
        Initialization.gcInit(gc,brush);
        int x1=dots.get(0).getX();
        int x2=dots.get(1).getX();
        int y1=dots.get(0).getY();
        int y2=dots.get(1).getY();

        int x=x1;
        int y=y1;

        int width=Math.abs(dots.get(1).getX()-dots.get(0).getX());
        int height=Math.abs(dots.get(1).getY()-dots.get(0).getY());
        if(x1>x2&&y1>y2){
            x=x2;
            y=y2;
        }else
        {
            if(x1<x2&&y1>y2){
                x=x1;
                y=y2;
            }else
            {
                if(x1>x2&&y1<y2){
                    x=x2;
                    y=y1;
                }
            }
        }


        gc.strokeOval(x,y,width,height);
        gc.fillOval(x,y,width,height);



    }

    @Override
    public boolean isMoreThan2dots() {
        return false;
    }
}
