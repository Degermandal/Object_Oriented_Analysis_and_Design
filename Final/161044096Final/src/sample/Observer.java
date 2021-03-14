package sample;

import javafx.scene.canvas.GraphicsContext;

public interface Observer {
    /**
     * Update method
     * @param x x
     * @param y y
     * @param gc gc
     */
    void update(double x, double y, GraphicsContext gc);
}
