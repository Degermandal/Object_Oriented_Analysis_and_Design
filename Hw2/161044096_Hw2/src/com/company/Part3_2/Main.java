package com.company.Part3_2;

public class Main {

    public static void main(String[] args)  {

        HiTech ht = new HiTech();
        Observer obs1 = new TrafficLight(ht);
        ht.add(obs1);
        TrafficLight trafficLight = new TrafficLight(ht);

        trafficLight.switchRedtoGreen();
        ht.changeDetected(true);
        trafficLight.switchGreentoYellow();
        trafficLight.switchYellowtoRed();

        System.out.println("-------------------------------------------");

        trafficLight.switchRedtoGreen();
        ht.changeDetected(false);
        trafficLight.switchGreentoYellow();
        trafficLight.switchYellowtoRed();

        System.out.println("-------------------------------------------");

    }

}


