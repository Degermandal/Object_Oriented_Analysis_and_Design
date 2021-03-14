package com.company.Part2;

/**
 *  Modern (new) payment class
 */
public interface ModernPayment {

    /**
     *
     * @param cardNo card no
     * @param amount amount
     * @param destination destination
     * @param installments installments
     * @return
     */
    int pay(String cardNo, float amount, String destination, String installments);
}



