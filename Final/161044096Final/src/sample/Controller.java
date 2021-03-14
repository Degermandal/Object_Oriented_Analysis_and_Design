package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Controller {

    /**
     * Model reference
     */
    private final Model model ;
    /**
     * GraphicsContext reference
     */
    GraphicsContext gc;
    Canvas canvas;

    /**
     * constructor
     * @param model model reference
     */
    public Controller(Model model) {
        this.model = model ;
        initModel();
    }

    /**
     * Initialize Model
     */
    public void initModel()
    {
        //gc = canvas.getGraphicsContext2D();
        model.initializeGc(gc);
    }
}
