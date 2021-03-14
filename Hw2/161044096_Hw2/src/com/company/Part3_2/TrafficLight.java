package com.company.Part3_2;

public class TrafficLight implements Observer{

    /**
     * Red state
     */
    State redState;
    /**
     * Yellow state
     */
    State yellowState;
    /**
     * Green state
     */
    State greenState;

    /**
     * Initial state
     */
    State state;

    /**
     * Constructor
     * Create state objects and assign to initial state as red state
     */
    public TrafficLight(HiTech hiTech) {
        redState = new RedState(this, 15);
        yellowState = new YellowState(this, 3);
        greenState = new GreenState(this, hiTech.getTimeoutX());

        state = redState;
    }

    /**
     * Switch red to green
     */
    public void switchRedtoGreen()  {
        state.switchRedtoGreen();
    }

    /**
     * Switch yellow to red
     */
    public void switchYellowtoRed()  {
        state.switchYellowtoRed();
    }

    /**
     * Switch green to yellow
     */
    public void switchGreentoYellow()  {
        state.switchGreentoYellow();
    }

    /**
     * Update subscriber about the new text content.
     * @param obs
     */
    @Override
    public void update(Object obs) {
        if (obs instanceof HiTech) {
            HiTech hiTech = (HiTech) obs;
                System.out.println("MOBESE Camera software subscribed.");
        }
    }

    /**
     * Get Red state
     * @return redState
     */
    public State getRedState() {
        return redState;
    }

    /**
     * Get Yellow state
     * @return yellowState
     */
    public State getYellowState() {
        return yellowState;
    }

    /**
     * Get Green state
     * @return greenState
     */
    public State getGreenState() {
        return greenState;
    }


    /**
     * Get initial state
     * @return state
     */
    public State getState() {
        return state;
    }

    /**
     * Set red state
     * @param redState redState
     */
    public void setRedState(State redState) {
        this.redState = redState;
    }

    /**
     * Set yellow state
     * @param yellowState yelowState
     */
    public void setYellowState(State yellowState) {
        this.yellowState = yellowState;
    }

    /**
     * Set green state
     * @param greenState greenState
     */
    public void setGreenState(State greenState) {
        this.greenState = greenState;
    }


    /**
     * Set initial state
     * @param state state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * ToString() method
     * @return string
     */
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nTraffic Light State Design Pattern\n");

        result.append("Traffic Light is " + state + "\n");
        return result.toString();
    }


}