package com.company.Part4;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement cosine transformation that extends the DiscreteTransformation
 */
public class DiscreteCosineTransform extends DiscreteTransform{

    /**
     * Discrete Cosine Transform implementation
     * @param real real numbers of equations
     * @param imag imaginary numbers of equations
     * @return result of Discrete Cosine Transform
     */
    @Override
    protected List<List<Double>> transform(List<Double> real, List<Double> imag) {
        int N = real.size();
        List<Double> OutReel = new ArrayList<Double>();

        for (int k = 0; k< N; ++k){
            double realSum = 0;
            for (int n=0; n< N; ++n){
                Double a = real.get(n);

                double theta =  Math.PI / N * (n + 1/2) * k;
                realSum += a * Math.cos(theta);
            }
            OutReel.add(realSum);
        }
        List<List<Double>> Result = new ArrayList<List<Double>>();
        Result.add(OutReel);
        return Result;
    }
}
