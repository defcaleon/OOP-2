package com.website.interfaces;

import com.website.model.Dot;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

public interface Lines {

    void paint(GraphicsContext gc,Brushes brush,ArrayList<Dot> dots);
    boolean isMoreThan2dots();

}
