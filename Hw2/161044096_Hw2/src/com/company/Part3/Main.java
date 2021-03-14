package com.company.Part3;

public class Main {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.switchRedtoGreen();
        trafficLight.switchGreentoYellow();
        trafficLight.switchYellowtoRed();
        System.out.println("\n");

        trafficLight.switchGreentoYellow();
        trafficLight.switchYellowtoRed();
        trafficLight.switchRedtoGreen();
        System.out.println("\n");

        trafficLight.switchGreentoYellow();
        trafficLight.switchRedtoGreen();
        trafficLight.switchYellowtoRed();
        System.out.println("\n");

        trafficLight.switchYellowtoRed();
        trafficLight.switchRedtoGreen();
        trafficLight.switchGreentoYellow();

    }

}


