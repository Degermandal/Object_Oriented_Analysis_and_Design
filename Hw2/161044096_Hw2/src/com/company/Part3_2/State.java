package com.company.Part3_2;

/**
 * State Interface for all actions
 */
public interface State {
    /**
     * Switch red to green action
     */
    void switchRedtoGreen();
    /**
     * Switch green to yellow action
     */
    void switchGreentoYellow();
    /**
     * Switch yellow to red action
     */
    void switchYellowtoRed();
}