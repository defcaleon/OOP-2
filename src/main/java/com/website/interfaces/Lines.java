package com.website.interfaces;

import com.website.model.Dot;
import javafx.scene.canvas.GraphicsContext;

public interface Lines {
    void paint(GraphicsContext gc,Brushes brush);

    public Dot[] getDots();
    public void setDots(Dot[] dots);

}
