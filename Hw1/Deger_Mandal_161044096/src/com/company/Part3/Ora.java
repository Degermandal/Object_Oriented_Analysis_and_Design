package com.company.Part3;

/**
 * Create a Ora class that extend from ArmoredSuits
 */
public class Ora extends ArmoredSuits {
    /**
     * Create a suit object that don't need override methods of ArmoredSuits.
     * Assign the required informations
     */
    public Ora() {
        cost    = 1500;
        weight  = 30;
        suitNames = "Ora";
    }
}