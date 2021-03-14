package com.company.Part3;

/**
 * Create a RocketLauncher class that extend from ArmoredSuitsDecorator
 */
public class RocketLauncher extends ArmoredSuitsDecorator {
    /**
     * Create a accessory object that don't need override methods of ArmoredSuitsDecorator.
     * Assign the required informations
     * @param suit is Suit object
     */
    public RocketLauncher(ArmoredSuits suit) {
        this.suit   = suit;
        cost    = 150;
        weight  = 7.5;
        suitNames = "RocketLauncher";
    }
}
