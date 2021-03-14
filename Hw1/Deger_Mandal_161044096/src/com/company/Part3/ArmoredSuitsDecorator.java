package com.company.Part3;

/**
 * The Decorator class is derived by accessories of suit.
 */
public abstract class ArmoredSuitsDecorator extends ArmoredSuits {
    /**
     * The reference of ArmoredSuits
     */
    protected ArmoredSuits suit;

    /**
     * Get suitNames
     * @return suit name and accessories of suit
     */
    @Override
    public String getSuitNames(){
        return suit.getSuitNames() + ", " + suitNames;
    }

    /**
     * Get cost
     * @return the total cost
     */
    @Override
    public double getCost(){
        return suit.getCost() + cost;
    }

    /**
     * Get weight
     * @return the total weight
     */
    @Override
    public double getWeight() {
        return suit.getWeight() + weight;
    }
}
