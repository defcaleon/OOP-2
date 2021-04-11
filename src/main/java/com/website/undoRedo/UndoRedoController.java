package com.website.undoRedo;

import com.website.fmodel.Proection;
import javafx.scene.canvas.GraphicsContext;

import java.io.Serializable;
import java.util.ArrayList;

public class UndoRedoController implements Serializable {

    private ArrayList<Proection> arr;
    private int currIndex;

    public UndoRedoController() {

        this.arr = new ArrayList<>();
        currIndex=0;
    }


    public void addFigure(Proection figure){

        clearArrFromIndex();
        arr.add(figure);
        currIndex++;
    }

    public void  undo(GraphicsContext gc){
        currIndex--;
        if (currIndex >= 0) {
            for(int i=0;i<currIndex;i++){
                arr.get(i).getFigure().paint(gc,arr.get(i).getBrush(),arr.get(i).getDots());
            }
        }else
        {

            currIndex=0;
        }
    }
    public void redo(GraphicsContext gc){
        currIndex++;
        if (currIndex < arr.size()) {
            for(int i=0;i<currIndex;i++){
                arr.get(i).getFigure().paint(gc,arr.get(i).getBrush(),arr.get(i).getDots());
            }
        }else
        {
            currIndex=arr.size();
            fullArrDraw(gc);

        }
    }

    public void fullArrDraw(GraphicsContext gc){
        for(int i=0;i<currIndex;i++){
            arr.get(i).getFigure().paint(gc,arr.get(i).getBrush(),arr.get(i).getDots());
        }
    }

    public void clearFigureArr(){
        arr.clear();
        currIndex=0;
    }



    private  void clearArrFromIndex(){

        int arrSize=arr.size();
        for(int i=currIndex;i<arrSize;i++){
            arr.remove(arr.size()-1);
        }
    }

    @Override
    public String toString() {
        return "UndoRedoController{" +
                "arr=" + arr +
                ", currIndex=" + currIndex +
                '}';
    }

}
