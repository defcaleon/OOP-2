
import javafx.scene.canvas.GraphicsContext;

import java.io.Serializable;
import java.util.ArrayList;

public interface Lines extends Serializable {

    void paint(GraphicsContext gc, Brushes brush, ArrayList<Dot> dots);
    boolean isMoreThan2dots();

}
