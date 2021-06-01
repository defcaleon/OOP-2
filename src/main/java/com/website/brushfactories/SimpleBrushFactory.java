package com.website.brushfactories;

import com.website.brushes.SimpleBrush;
import interfaces.Brushes;

public class SimpleBrushFactory implements BrushFactory {

    @Override
    public Brushes createBrush() {
        return  new SimpleBrush();
    }
}
