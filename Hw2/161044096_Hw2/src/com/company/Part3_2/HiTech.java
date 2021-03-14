package com.company.Part3_2;

import java.util.ArrayList;

public class HiTech implements Subject{

    /**
     * The list is keeping subscribers
     */
    private ArrayList<Observer> observersL;
    private int timeoutX;

    /**
     * This is a constructor to create an arraylist for observer list
     */
    public HiTech() {
        timeoutX = 60;
        observersL = new ArrayList<Observer>();
    }

    public void changeDetected(boolean flag){
        if(flag)
        {
            timeoutX = 90;
            System.out.println("Now lot of traffic and wait 90 seconds ...");
        }
        else
        {
            timeoutX = 60;
            System.out.println("Now traffic is normal and wait 60 seconds ...");
        }
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
        if (i>=0) {
            observersL.remove(i);
        }
    }

    public int getTimeoutX() {
        return timeoutX;
    }

    public void setTimeoutX(int timeoutX) {
        this.timeoutX = timeoutX;
    }


}
