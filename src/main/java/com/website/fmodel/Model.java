package com.website.fmodel;


import com.website.brushes.SimpleBrush;
import com.website.brushfactories.BrushFactory;
import interfaces.FigureFactory;
import com.website.figuresfactories.LineFactory;


import interfaces.Brushes;
import interfaces.Lines;
import com.website.undoRedo.UndoRedoController;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.paint.Color;
import model.Dot;

import java.io.*;
import java.util.ArrayList;

public class Model {

    //private ArrayList<Proection> figureArr = new ArrayList<>();
    private UndoRedoController undoRedoController= new UndoRedoController();
    private FigureFactory fabric;
    private BrushFactory brushFabric;

    private Brushes brush;
    private final Brushes whiteBrush = new SimpleBrush();
    private boolean lastFigureHave2OrMoreDors;

    public void start(GraphicsContext gc){

        fabric =  new LineFactory();
        this.brushFabric=Initialization.getBrushByName("simple");
        assert brushFabric != null;
        this.brush = brushFabric.createBrush();
        brushStartInit(this.brush);
        Initialization.whiteBrushInit(whiteBrush);
        lastFigureHave2OrMoreDors=false;

    }

    public void setFabric(FigureFactory fabric) {
        this.fabric = fabric;
    }

    public void draw(GraphicsContext gc, ArrayList<Dot> dotArr, String figure){


        assert fabric != null;
        Lines figure1 = fabric.createFigure();
        figure1.paint(gc,this.brush,dotArr);
        lastFigureHave2OrMoreDors=figure1.isMoreThan2dots();

        undoRedoController.addFigure(new Proection(figure1,dotArr,brush));
        //figureArr.add(new Proection(figure1,dotArr,brush));
        dotArr.clear();
    }



    private void brushStartInit(Brushes brush){
        brush.setBrushLineColor(Color.BLACK);
        brush.setBrushFillColor(Color.WHITE);
        brush.setBrushWidth(2);
    }

    public void redraw(GraphicsContext gc){
       undoRedoController.fullArrDraw(gc);

    }
    public void mouseDraw(GraphicsContext gc, ArrayList<Dot> dotArr, String figure) {

        assert fabric != null;
        Lines figure1 = fabric.createFigure();
        figure1.paint(gc, this.brush, dotArr);
    }
    public boolean is2OrMoreDotsInFigure(){
        return lastFigureHave2OrMoreDors;
    }


    public void setBrushLineColor(Color color){
        brush.setBrushLineColor(color);
    }
    public void setBrushFillColor(Color color){
        brush.setBrushFillColor(color);
    }
    public void setBrushWidth(int width){
        brush.setBrushWidth(width);
    }

    public void clearFigureArr(){
        undoRedoController.clearFigureArr();
    }

    public void undo(GraphicsContext gc){
        undoRedoController.undo(gc);
    }
    public  void redo(GraphicsContext gc){
        undoRedoController.redo(gc);
    }
    public void serialize(File file){

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)))
        {
            oos.writeObject(undoRedoController);
        }
        catch(Exception ex){

            System.out.println();
            System.out.println(ex.getMessage());
        }
    }

    public  void deserialize(File file){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)))
        {

            undoRedoController=(UndoRedoController) ois.readObject();
        }
        catch(Exception ex){
            System.out.println();
            System.out.println(ex.getMessage());

        }
    }




}
