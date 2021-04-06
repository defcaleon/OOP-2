package com.website;

import com.website.model.Dot;
import com.website.model.Initialization;
import com.website.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;


public class MainController {

    private final Initialization init = new Initialization();
    private  GraphicsContext gc;
    private final Model model = new Model();
    private final ArrayList<Dot> dotArr = new ArrayList<>();

    @FXML
    private Button drawBtn;

    @FXML
    private TextField cordY;

    @FXML
    private TextField cordX;

    @FXML
    private Canvas canvas;

    @FXML
    private ComboBox<String> figureBox;

    @FXML
    private ComboBox<Integer> brushWidth;



    @FXML
    private Rectangle col1;

    @FXML
    private Rectangle col2;
    @FXML
    private ColorPicker colorBar;




    @FXML
    public void initialize() {

        init.loadBrushTypes(brushWidth);
        init.loadFigures(figureBox);
        this.gc = canvas.getGraphicsContext2D();

        model.start(gc);


    }


    public void color2Clicked(MouseEvent mouseEvent) {
       col2.setFill(colorBar.getValue());
       model.setBrushFillColor(colorBar.getValue());

    }

    public void color1Clicked(MouseEvent mouseEvent) {
        col1.setFill(colorBar.getValue());
        model.setBrushLineColor(colorBar.getValue());
    }

    public void drawBtnClick(MouseEvent mouseEvent) {
        if(dotArr.size()==0){
            Model.alert("no dots");
        }else{
            model.draw(this.gc,this.dotArr,figureBox.getValue().toString());
        }
    }


    public void addCordBtnClick(MouseEvent mouseEvent) {

        int cordX =  this.init.ValidTextArea(this.cordX.getText());
        int cordY =  this.init.ValidTextArea(this.cordY.getText());

        if(cordX<0||cordY<0){
            Model.alert("cords must be positive numbers");
        }else{
            Dot dot=new Dot(cordX,cordY);
            this.dotArr.add(dot);

        }
    }

    public void deleteBtnClick(MouseEvent mouseEvent) {
        dotArr.clear();
    }

    public void comboAction(ActionEvent actionEvent) {
        model.setBrushWidth(brushWidth.getValue());
        System.out.println(brushWidth.getValue());
    }

    public void comboAction2(ActionEvent actionEvent) {

    }
}
