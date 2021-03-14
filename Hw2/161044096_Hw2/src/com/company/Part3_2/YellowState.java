package com.company.Part3_2;

import static java.lang.Thread.sleep;

public class YellowState implements State {
    /**
     * TrafficLight reference
     */
    TrafficLight trafficL;
    private int time;

    /**
     * Constructor
     * @param trafficL TrafficLight reference
     */
    public YellowState(TrafficLight trafficL, int time) {
        this.trafficL = trafficL;
        this.time = time;
    }

    /**
     * Switch the traffic light red to green
     * Now Traffic Light is yellow state so the action can not be done.
     */
    @Override
    public void switchRedtoGreen(){
        System.out.println("Now traffic light is Yellow so can not action red to green.");
    }

    /**
     * Switch the traffic light green to yellow
     * Now Traffic Light is yellow state so the action can not be done.
     */
    @Override
    public void switchGreentoYellow() {
        System.out.println("Now traffic light is Yellow so can not action green to yellow.");
    }

    /**
     * Switch the traffic light yellow to red
     * Now Traffic Light is yellow state so the action will be done.
     */
    @Override
    public void switchYellowtoRed() {
        System.out.println("Wait to switch Yellow to Red ( " + time + " seconds) ...");
        //sleep(3);
        trafficL.setState(trafficL.getRedState());
        System.out.println("Now traffic light is Red.");
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
        return "Yellow Traffic Light";
    }
}

