package com.company.Part3_2;


import static java.lang.Thread.sleep;

public class RedState implements State {
    /**
     * TrafficLight reference
     */
    TrafficLight trafficL;
    private int time;

    /**
     * Constructor
     * @param trafficL TrafficLight reference
     */
    public RedState(TrafficLight trafficL, int time) {
        this.trafficL = trafficL;
        this.time = time;
    }

    /**
     * Switch the traffic light red to green
     * Now Traffic Light is red state so the action will be done.
     */
    @Override
    public void switchRedtoGreen() {
        System.out.println("Wait to switch Red to Green ( " + time + " seconds) ...");
        //sleep(15);
        trafficL.setState(trafficL.getGreenState());
        System.out.println("Now traffic light is Green.");
    }

    /**
     * Switch the traffic light green to yellow
     * Now Traffic Light is red state so the action can not be done.
     */
    @Override
    public void switchGreentoYellow() {
        System.out.println("Now traffic light is Red so can not action green to yellow.");
    }

    /**
     * Switch the traffic light yellow to red
     * Now Traffic Light is red state so the action can not be done.
     */
    @Override
    public void switchYellowtoRed() {
        System.out.println("Now traffic light is Red so can not action yellow to red.");
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    /**
     * ToString() method
     * @return state string
     */
    public String toString() {
        return "Red Traffic Light";
    }

}
