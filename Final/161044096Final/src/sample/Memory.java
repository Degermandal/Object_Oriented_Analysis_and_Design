package sample;

public class Memory {
    /**
     * Position array
     */
    double[] position = new double[2];

    /**
     * Constructor
     */
    public Memory(){
        double[] position = new double[2];
    }

    /**
     * Set positions
     * @param x x
     * @param y y
     */
    public void setPosition(double x, double y){
        position[0] = x;
        position[1] = y;
    }
}
