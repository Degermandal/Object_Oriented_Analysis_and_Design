package sample;

import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.Random;

public class Person implements Runnable{
    /**
     * Id for each person
     */
    private IntegerProperty id = new SimpleIntegerProperty();
    /**
     * Memory reference
     */
    private Memory memory;

    /**
     * Person position X
     */
    private DoubleProperty positionX = new SimpleDoubleProperty();
    /**
     * Person position Y
     */
    private DoubleProperty positionY = new SimpleDoubleProperty();

    /**
     * Set x and y values
     * @param x x value
     * @param y y value
     */
    public void setPosition (double x, double y){
        this.positionX.set(x);
        this.positionY.set(y);
        this.memory.setPosition(x,y);
    }

    /**
     * Constructor
     * @param id id
     * @param x x
     * @param y y
     */
    public Person(int id, double x, double y){
        this.setID(id);
        memory = new Memory();
        this.setPosition(x, y);
    }

    /**
     * Move method to target values
     * @param x x
     * @param y y
     */
    public void move (double x, double y){
        this.setPosition(x, y);
    }

    /**
     * Run method for next x and y values
     */
    public void run(){
        while(true){
            Platform.runLater(() -> {
                Random r = new Random();
                double nextX = 0 + (600) * r.nextDouble();
                double nextY = 0 + (1000) * r.nextDouble();
                this.move(nextX, nextY);
            });

            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }//end run

    public void setID(int id){this.id.set(id);}
    public int getId(){ return this.id.get();};
}
