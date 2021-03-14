package com.company.Part3;

/**
 * Create a Laser class that extend from ArmoredSuitsDecorator
 */
public class Laser extends ArmoredSuitsDecorator {
    /**
     * Create a accessory object that don't need override methods of ArmoredSuitsDecorator.
     * Assign the required informations
     * @param suit is Suit object
     */
    public Laser(ArmoredSuits suit) {
        this.suit   = suit;
        cost    = 200;
        weight  = 5.5;
        suitNames = "Laser";
    }
}
