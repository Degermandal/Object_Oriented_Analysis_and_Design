package com.company.Part3_2;

public interface Subject {
    /**
     * Add subscriber to in observer list
     * @param obs
     */
    void add(Observer obs);

    /**
     * Remove subscriber from observer list
     * @param obs
     */
    void remove(Observer obs);

    /**
     * If content data is changed, notify subscriber (observer)
     */
    void notifyObserver();
}
