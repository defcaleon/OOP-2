package com.website.brushfactories;

import com.website.brushes.SimpleBrush;
import com.website.interfaces.Brushes;

public class SimpleBrushFactory implements BrushFactory {

    @Override
    public Brushes createBrush() {
        return  new SimpleBrush();
    }
}
