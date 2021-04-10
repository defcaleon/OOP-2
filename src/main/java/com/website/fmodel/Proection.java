package com.website.fmodel;

import com.website.interfaces.Brushes;
import com.website.interfaces.Lines;


import java.util.ArrayList;

public class Proection  {

    private final Lines figure;
    private final ArrayList<Dot> dots;
    private final Brushes brush;


    public Proection(Lines figure, ArrayList<Dot> dots,Brushes brush) {
        this.figure = figure;
        this.dots = new ArrayList<>(dots);
        this.brush=  Initialization.getBrushCopy(brush);
    }

    public Lines getFigure() {
        return figure;
    }

    public ArrayList<Dot> getDots() {
        return dots;
    }

    public Brushes getBrush(){
        return  brush;
    }

}
