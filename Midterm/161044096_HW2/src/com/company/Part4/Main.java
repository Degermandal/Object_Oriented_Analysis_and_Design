package com.company.Part4;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        String filename = "inputFile.txt"; //read equations from the file.
        DiscreteTransform discreteCosineTransform= new DiscreteCosineTransform();
        DiscreteTransform discreteFourierTransform = new DiscreteFourierTransform();

        System.out.println("Discrete Cosine Transform");
        discreteCosineTransform.calculateTransform(filename);
        System.out.println("Discrete Fourier Transform");
        discreteFourierTransform.calculateTransform(filename);


    }

}
