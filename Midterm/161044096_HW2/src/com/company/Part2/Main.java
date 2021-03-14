package com.company.Part2;

public class Main {

    public static void main(String[] args) {

        TurboPayment turboPayment = new ConcreteTurboPayment();
        System.out.println("---- Turbo Payment ----");
        turboPayment.payInTurbo("3456",230.99f,"Istanbul","3");
        System.out.println("------------------------------------------------------------");

        System.out.println("---- Modern Payment ----");
        ModernPayment modernPayment = new ConcreteModernPayment();
        modernPayment.pay("4123", 219.99f, "Kocaeli", "5");
        System.out.println("------------------------------------------------------------");

        System.out.println("---- Modern with Turbo Payment ----");
        TurboPayment payment = new ModernPaymentAdaptor(modernPayment);
        payment.payInTurbo("4202", 100.0f, "Konya", "9");
        System.out.println("------------------------------------------------------------");

    }
}
