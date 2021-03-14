package com.company.Part2;

/**
 * Old Payment Class
 */
public interface TurboPayment {

    /**
     *
     * @param turboCardNo card no
     * @param turboAmount amount
     * @param destinationTurboOfCourse destination
     * @param installmentsButInTurbo installments
     * @return
     */
    int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo);
}

