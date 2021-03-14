package com.company.Part3_2;


import static java.lang.Thread.sleep;

public class GreenState implements State {
    /**
     * TrafficLight reference
     */
    TrafficLight trafficL;
    private int time;

    /**
     * Constructor
     * @param trafficL TrafficLight reference
     */
    public GreenState(TrafficLight trafficL, int time) {
        this.trafficL = trafficL;
        this.time = time;
    }

    /**
     * Switch the traffic light red to green
     * Now Traffic Light is green state so the action can not be done.
     */
    @Override
    public void switchRedtoGreen() {
        System.out.println("Now traffic light is Green so can not action red to green.");
    }

    /**
     * Switch the traffic light green to yellow
     * Now Traffic Light is green state so the action will be done.
     */
    @Override
    public void switchGreentoYellow() {
        trafficL.setState(trafficL.getYellowState());
        System.out.println("Now traffic light is Yellow.");
    }

    /**
     * Switch the traffic light yellow to red
     * Now Traffic Light is green state so the action can not be done.
     */
    @Override
    public void switchYellowtoRed(){
        System.out.println("Now traffic light is Green so can not action yellow to green.");
    }

    /**
     * ToString() method
     * @return state string
     */
    public String toString() {
        return "Green Traffic Light";
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

