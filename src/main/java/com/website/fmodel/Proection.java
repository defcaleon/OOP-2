package com.website.fmodel;


import interfaces.Brushes;
import interfaces.Lines;
import model.Dot;


import java.io.Serializable;
import java.util.ArrayList;

public class Proection implements Serializable {

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
