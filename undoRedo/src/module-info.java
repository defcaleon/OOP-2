import by.site.UndoRedoController;
import by.site.UndoRedoService;

module undoRedo{
  exports by.site;
  requires com.website;
  requires javafx.controls;

  provides  UndoRedoService with UndoRedoController;

}
