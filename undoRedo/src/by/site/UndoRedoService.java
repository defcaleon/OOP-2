package by.site;

import com.website.fmodel.Proection;
import javafx.scene.canvas.GraphicsContext;


public interface UndoRedoService {

    void addFigure(Proection figure);

    void undo(GraphicsContext gc);

    void redo(GraphicsContext gc);

    void fullArrDraw(GraphicsContext gc) ;

    void clearFigureArr();

}
