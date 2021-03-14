package com.company.Part3;

/**
 * Create a Dec class that extend from ArmoredSuits
 */
public class Dec extends ArmoredSuits {
    /**
     * Create a suit object that don't need override methods of ArmoredSuits.
     * Assign the required informations
     */
    public Dec() {
        cost    = 500;
        weight  = 25;
        suitNames = "Dec";
    }
}
