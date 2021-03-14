package com.company.Part4;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Implement Fourier transformation that extends the DiscreteTransformation
 */
public class DiscreteFourierTransform extends DiscreteTransform {
    /**
     * Elapsed time for transform method.
     */
    private long elapsedTime;

    /**
     * Apply Discrete Fourier Transform to given matrix
     * @param real real items of equations
     * @param imag imaginary items of equations
     * @return Discrete Fourier Transform as real and imag in one list.
     */
    @Override
    protected List<List<Double>> transform(List<Double> real, List<Double> imag) {
        long startTime = System.nanoTime();
        int N = real.size();
        List<Double> OutReel = new ArrayList<Double>();
        List<Double> OutComplex = new ArrayList<Double>();

        for (int k = 0; k< N; ++k){
            double realSum = 0;
            double imgSum = 0;

            for (int n=0; n< N; ++n){
                Double a = real.get(n);
                Double b = imag.get(n);

                double theta = 2 * Math.PI * n * k / N;
                realSum += a * Math.cos(theta) + b * Math.sin(theta);
                imgSum +=  b * Math.cos(theta) - a * Math.sin(theta);

            }
            OutReel.add(realSum);
            OutComplex.add(imgSum);

        }
        List<List<Double>> Result = new ArrayList<List<Double>>();
        Result.add(OutReel);
        Result.add(OutComplex);

        long endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        return Result;
    }

    /**
     * Ask users to see execution DFT in nanotime
     */
    @Override
    protected void addExtra() {
        System.out.println("Time of execution DFT in nanotime: " + elapsedTime);
    }

    /**
     * Ask user to need some extra. Helped from book.
     * @return answer
     */
    protected boolean customerWantsExtra(){
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y"))
            return true;
        else
            return false;
    }

    /**
     * Get input from user
     * @return answer
     */
    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like see time of execution (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
