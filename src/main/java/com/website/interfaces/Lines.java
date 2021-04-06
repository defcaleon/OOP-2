package com.website.interfaces;

import com.website.model.Dot;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public interface Lines {
    void paint(GraphicsContext gc,Brushes brush);

    public ArrayList<Dot> getDots();
    public void setDots(ArrayList<Dot> dots);



}
