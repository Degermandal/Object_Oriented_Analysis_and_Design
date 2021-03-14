package com.company.Part2;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ClockwiseSatelliteData data = new ClockwiseSatelliteData(matrix);
        Iterator<Integer> iter = data.getIterator();

        System.out.println("Satellite 2D Data: ");
        for (int[] dat : matrix) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(dat[j] + " ");
            System.out.println();
        }
        System.out.println("\nClockwise Iterated Data : ");
        while(iter.hasNext())
            System.out.print(iter.next() + " ");
        System.out.println("\n--------------------------------------------------------------------------------------");


        int[][] matrix2 = {{1,2,3,4, 5,6,7,8, 9,10},{11,12,13,14, 15,16,17,18, 19,20},{21,22,23,24, 25,26,27,28, 29,30}};
        ClockwiseSatelliteData data2 = new ClockwiseSatelliteData(matrix2);
        Iterator<Integer> iter2 = data2.getIterator();

        System.out.println("Satellite 2D Data: ");
        for (int[] dat : matrix2) {
            for (int j = 0; j < matrix2[0].length; j++)
                System.out.print(dat[j] + " ");
            System.out.println();
        }
        System.out.println("\nClockwise Iterated Data : ");
        while(iter2.hasNext())
            System.out.print(iter2.next() + " ");
        System.out.println("\n--------------------------------------------------------------------------------------");



    }
}
