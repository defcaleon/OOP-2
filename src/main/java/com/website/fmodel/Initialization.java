package com.website.fmodel;

import com.website.brushes.SimpleBrush;
import com.website.brushfactories.BrushFactory;
import com.website.brushfactories.SimpleBrushFactory;
import com.website.figuresfactories.*;

import com.website.interfaces.Brushes;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;


import java.util.ArrayList;


public class Initialization {

    private  ArrayList<String> strArr = new ArrayList<>();
    private  ArrayList<FigureFactory> arr=arrFactoryInit();


    private  ArrayList<FigureFactory> arrFactoryInit(){

        arr = new ArrayList<>();
        addNewFigure(new EllipseFactory());
        addNewFigure(new LineFactory());
        addNewFigure(new PolygonFactory());
        addNewFigure(new PolyLineFactory());
        addNewFigure(new RectangleFactory());
        addNewFigure(new TrapeziumFactory());
        return arr;
    }




    public  FigureFactory  getFactoryByName(String name){
        int index = strArr.indexOf(name);
        return arr.get(index);

    }

    //afterr add need call loadFigures;
    public void addNewFigure(FigureFactory figure){
        arr.add(figure);
        strArr.add(figure.getFigureName());


    }


    public  void loadBrushTypes(ComboBox<Integer> brushType){

        ObservableList<Integer> arr = FXCollections.observableArrayList(2,3,4,5,6,7,8,10,12,14,18,22,26,30,36,42,50,60,72);
        brushType.setItems(arr);
        brushType.getSelectionModel().selectFirst();
    }

    public void loadFigures(ComboBox<String> brushType){
        // ObservableList<String> arr = FXCollections.observableArrayList("line","rectangle","ellipse","polyline","polygon");

        brushType.setItems(FXCollections.observableList(strArr));
        brushType.getSelectionModel().selectFirst();
    }

    public static void gcInit(GraphicsContext gc, Brushes brush){
        gc.setLineWidth(brush.getBrushWidth());
        gc.setStroke(brush.getBrushLineColor());
        gc.setFill(brush.getBrushFillColor());
    }

    public int ValidTextArea(String text){
        try {
            int i= Integer.parseInt(text);
            return  i<0? -1:i;
        }catch (Exception e){
            return -1;
        }

    }

    public static double[] dotArrToIntXArr(ArrayList<Dot> dots){
        double[] arr=new double[dots.size()];
        for(int i=0;i<dots.size();i++){
            arr[i]=dots.get(i).getX();
        }

        return  arr;
    }
    public static double[] dotArrToIntYArr(ArrayList<Dot> dots){
        double[] arr=new double[dots.size()];
        for(int i=0;i<dots.size();i++){
            arr[i]=dots.get(i).getY();
        }

        return  arr;
    }

    public static void whiteBrushInit(Brushes brush){

        brush.setBrushFillColor(Color.WHITE);
        brush.setBrushLineColor(Color.WHITE);
    }


    public static BrushFactory getBrushByName(String name){

        switch (name){
            case "simple":{
                return new SimpleBrushFactory();
            }

            default: return null;
        }
    }

    public  static Brushes getBrushCopy(Brushes brush){
        //
        return new SimpleBrush(brush.getBrushLineColor(),brush.getBrushFillColor(), brush.getBrushWidth());

    }
}
