package com.company.Part3;

/**
 * Create a Tor class that extend from ArmoredSuits
 */
public class Tor extends ArmoredSuits {
    /**
     * Create a suit object that don't need override methods of ArmoredSuits.
     * Assign the required informations
     */
    public Tor() {
        cost    = 5000;
        weight  = 50;
        suitNames = "Tor";
    }
}