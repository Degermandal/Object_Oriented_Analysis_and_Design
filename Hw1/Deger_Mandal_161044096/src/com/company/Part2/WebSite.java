package com.company.Part2;

import java.util.ArrayList;

public class WebSite implements Subject {
    /**
     * The object is reference to DisplayContent
     * Display info
     */
    private DisplayContent content;
    /**
     * The list is keeping subscribers
     */
    private ArrayList<Observer> observersL;

    /**
     * This is a constructor to create an arraylist for observer list
     */
    public WebSite() {
        observersL = new ArrayList<Observer>();
    }

    /**
     * If content is changed, notify subscribers (observers)
     */
    @Override
    public void notifyObserver() {
        for(Observer subscriber : observersL)
            subscriber.update(this);
    }

    /**
     * Add subscriber to in observer list
     * @param obs
     */
    @Override
    public void add(Observer obs) {
        observersL.add(obs);
    }

    /**
     * Remove subscriber from observer list
     * @param obs
     */
    @Override
    public void remove(Observer obs) {
        int i = observersL.indexOf(obs);
        //System.out.println("i: " + i);
        if (i>=0) {
           // System.out.println("Obje:  " + observersL.remove(i));
            observersL.remove(i);
        }
    }

    /**
     * Get Content
     * @return Content
     */
    public DisplayContent getContent() {
        return content;
    }

    /**
     * Update favorite content of netflix
     * @param content
     */
    public void updateContent(DisplayContent content) {
        this.content = content;
        notifyObserver();
    }
}
