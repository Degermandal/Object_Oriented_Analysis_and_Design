package com.company.Part2;


public class ModernPaymentAdaptor implements TurboPayment{

    /**
     * ModernPayment reference
     */
    private ModernPayment modernPayment;

    /**
     * Constructor
     * @param modernPayment modern payment
     */
    public ModernPaymentAdaptor(ModernPayment modernPayment){
        this.modernPayment = modernPayment;
    }

    /**
     * Make payment using ModernPayment object in payInTurbo method.
     * @param turboCardNo card no
     * @param turboAmount amount
     * @param destinationTurboOfCourse destination
     * @param installmentsButInTurbo installments
     * @return
     */
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {

        return modernPayment.pay(turboCardNo, turboAmount, destinationTurboOfCourse, installmentsButInTurbo);
    }
}
