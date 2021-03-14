package com.company.Part3;

/**
 * Create a AutoRifle class that extend from ArmoredSuitsDecorator
 */
public class AutoRifle extends ArmoredSuitsDecorator {
    /**
     * Create a accessory object that don't need override methods of ArmoredSuitsDecorator.
     * Assign the required informations
     * @param suit is Suit object
     */
    public AutoRifle(ArmoredSuits suit) {
        this.suit = suit;
        cost    = 30;
        weight  = 1.5;
        suitNames = "AutoRifle";
    }
}
