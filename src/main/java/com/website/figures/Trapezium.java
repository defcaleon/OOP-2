package com.website.figures;


import com.website.fmodel.Dot;
import com.website.fmodel.Initialization;
import com.website.fmodel.Model;
import com.website.interfaces.Brushes;
import com.website.interfaces.Lines;
import javafx.scene.canvas.GraphicsContext;
import java.util.ArrayList;


public class Trapezium implements Lines {

    @Override
    public void paint(GraphicsContext gc, Brushes brush, ArrayList<Dot> dots) {
        if(dots.size()<2){
             Model.alert("need 2 cords to draw rectangle");
            return;
        }
        Initialization.gcInit(gc,brush);

        double x1=dots.get(0).getX();
        double y1=dots.get(0).getY();
        double x2=dots.get(1).getX();
        double y2=dots.get(1).getY();

        double width=Math.abs((dots.get(1).getX()-dots.get(0).getX())/4);

        double[] arrX = new double[]{x1,x1+width,x2-width,x2};
        double[] arrY = new double[]{y2,y1,y1,y2};

        gc.strokePolygon(arrX,arrY, 4);
        gc.fillPolygon(arrX,arrY,4);
    }

    @Override
    public boolean isMoreThan2dots() {
        return false;
    }
}
