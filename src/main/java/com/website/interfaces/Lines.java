package com.website.interfaces;

import javafx.scene.canvas.GraphicsContext;

public interface Lines {

    void paint(GraphicsContext gc,Brushes brush);
    void delete();
    void copy();

    void onFocus();
    void offFocus();

    void serialize();
    void deserialize();


}
