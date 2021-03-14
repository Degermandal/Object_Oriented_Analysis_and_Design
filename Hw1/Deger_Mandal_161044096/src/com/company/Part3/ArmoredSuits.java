package com.company.Part3;

/**
 * The Abstract class of Armored Suits
 */
public abstract class ArmoredSuits {
    /**
     * Cost of suit and accessories
     */
    protected double cost;
    /**
     * Weight of suit and accessories
     */
    protected double weight;
    /**
     * Info about suit and accessories
     */
    protected String suitNames;

    /**
     * Get cost
     * @return cost is suit costs of all classes that using the getCost() method.
     */
    public  double getCost(){
        return cost;
    }

    /**
     * Get weight
     * @return weight is suit weights of all classes that using the getWeight() method.
     */
    public double getWeight(){
        return weight;
    }

    /**
     * Get suitNames
     * @return suitNames is suit names of all classes that using the getSuitNames() method.
     */
    public String getSuitNames(){
        return suitNames;
    }
}
