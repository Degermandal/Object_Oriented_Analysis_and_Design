package com.company.Part3;

/**
 * Create a FlameThrower class that extend from ArmoredSuitsDecorator
 */
public class FlameThrower extends ArmoredSuitsDecorator {
    /**
     * Create a accessory object that don't need override methods of ArmoredSuitsDecorator.
     * Assign the required informations
     * @param suit is Suit object
     */
    public FlameThrower(ArmoredSuits suit) {
        this.suit   = suit;
        cost    = 50;
        weight  = 2;
        suitNames = "FlameThrower";
    }
}
