package sample;

public interface Subject {
    //void addObserver(Observer o);
    //void removeObserver(Observer o);

    /**
     * Notify Observer
     * @param x x
     * @param y y
     */
    void NotifyObservers(double x, double y);
}