package com.company.Part3;

public class Main {
    public static void main(String[] args) {
        ArmoredSuits suit;
        suit = new Dec();
        System.out.println("Total cost and weight: " +  suit.getSuitNames() + "  =  "
                + suit.getCost() + "k TL ,  " + suit.getWeight() + "kg");

        suit = new Ora();
        suit = new FlameThrower(suit);
        suit = new AutoRifle(suit);
        suit = new RocketLauncher(suit);
        suit = new Laser(suit);
        System.out.println("Total cost and weight: " +  suit.getSuitNames() + "  =  "
                + suit.getCost() + "k TL ,  " + suit.getWeight() + "kg");

        suit = new Tor();
        suit = new FlameThrower(suit);
        suit = new AutoRifle(suit);
        suit = new AutoRifle(suit);
        suit = new Laser(suit);
        System.out.println("Total cost and weight: " +  suit.getSuitNames() + "  =  "
                + suit.getCost() + "k TL ,  " + suit.getWeight() + "kg");



    }
}
