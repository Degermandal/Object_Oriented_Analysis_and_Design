package com.company.Part2;

import java.util.Iterator;

/**
 * Clockwise satellite data class
 */
public class ClockwiseSatelliteData implements GetIterator {
    /**
     * Data
     */
    protected int[][] matrix;

    /**
     * Constructor
     * @param matrix (2D Data)
     */
    public ClockwiseSatelliteData(int[][] matrix){
        this.matrix = matrix;
    }

    /**
     * Get iterator
     * @return ClockwiseIterator object (Inner class)
     */
    public Iterator getIterator(){
        return new ClockwiseIterator(matrix);
    }

    /**
     * Clockwise iterator that iterates 2d matrix as spiral.
     */
    private class ClockwiseIterator implements Iterator{
        /**
         * Iterated data
         */
        private int[] iterData;
        /**
         * Current data index
         */
        private int index = 0;
        /**
         * length of the iterated data
         */
        private int len;

        /**
         *  Constructor
         * @param matrix (2D data)
         */
        private ClockwiseIterator(int[][] matrix){
            InitializeClockwiseData(matrix);
        }

        /**
         * Take 2D data and do clockwise iterated data
         * @param matrix (2D data)
         */
        private void InitializeClockwiseData(int[][] matrix){
            int columnR = matrix[0].length - 1; // move right on the column
            int columnL = 0; // move left on the column
            int rowU = 0; // move up on the row
            int rowD = matrix.length - 1; // move down on the row
            int temp = 0;

            iterData = new int[matrix[0].length * matrix.length];
            while(columnL <= columnR && rowU <= rowD)
            {
                for (int i = rowU; i <= columnR; i++) {
                    iterData[temp] = matrix[rowU][i];
                    temp++;
                }
                for(int i = rowU + 1; i <= rowD; i++) {
                    iterData[temp] = matrix[i][columnR];
                    temp++;
                }
                if(rowU + 1 <= rowD) {
                    for (int i = columnR - 1; i >= columnL; i--) {
                        iterData[temp] = matrix[rowD][i];
                        temp++;
                    }
                }
                if(columnL + 1 <= columnR) {
                    for (int i = rowD - 1; i > rowU; i--) {
                        iterData[temp] = matrix[i][columnL];
                        temp++;
                    }
                }
                columnL++;
                columnR--;
                rowU++;
                rowD--;
            }
            len = iterData.length;
        }

        /**
         * overrided hasNext() method
         * @return true or false
         * If index is smaller than length or not
         */
        @Override
        public boolean hasNext() {
            return index < len;
        }

        /**
         * overrided next() method
         * @return Object
         * Next number
         */
        @Override
        public Object next() {
            return iterData[index++];
        }
    }

}

