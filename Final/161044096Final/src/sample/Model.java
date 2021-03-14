package sample;

import javafx.scene.canvas.GraphicsContext;
import java.util.ArrayList;


public class Model implements Subject{
    /**
     * GraphicsContext reference
     */
    GraphicsContext gc;
    /**
     * Arraylist for Person class
     */
    protected ArrayList<Person> personArrayList = new ArrayList<Person>();

    /**
     * Constructor
     */
    Model()
    {

    }

    /**
     * Initialize GraphicsContext reference
     * @param gc gc
     */
    public void initializeGc(GraphicsContext gc)
    {
        this.gc = gc;
    }

    /**
     * Notify Observers
     * @param x x value
     * @param y y value
     */
    @Override
    public void NotifyObservers(double x, double y) {

    }
}
