package com.company.Part1;
import java.util.Scanner;

public class OperationMatrixInversion implements LinearStrategy {
    /**
     * The number of unknown variables of the linear equations.
     */
    private int unknownNOfVariables;

    /**
     * The elements of the matrix.
     */
    private double[][] matrix;

    /**
     * Take the number of rows and elements of matrix from the user as input
     */
    public OperationMatrixInversion() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, write the dimension of the matrix:");
        unknownNOfVariables = scan.nextInt();
        while (unknownNOfVariables <= 1)
        {
            System.out.println("Number of unknown variables must be bigger than 1, write again:");
            unknownNOfVariables = scan.nextInt();
        }
        matrix = new double[unknownNOfVariables][unknownNOfVariables];

        int temp;
        System.out.println("Please, write the elements of matrix =>");
        for (int i=0; i<unknownNOfVariables; ++i)
        {
            temp = i+1;
            System.out.println(temp + ". row : ");
            for (int j=0; j<unknownNOfVariables; ++j)
            {
                matrix[i][j] = scan.nextDouble();
            }
        }
    }

    /**
     * Solves the matrix inversion with the helper method,inverse().
     */
    @Override
    public void solution() {
        double[][] inverse = inverse(matrix);
        for (double[] doubles : inverse)
        {
            for (int j = 0; j < inverse.length; ++j)
            {
                System.out.print(doubles[j] + "     ");
            }
            System.out.println();
        }
    }

    /**
     * Create a matrix of minors.
     * @param iMatrix given matrix
     * @param row index of the row
     * @param column index of the column
     * @return tempD
     */
    public  double[][] subArray(double[][] iMatrix, int row, int column)
    {
        double[][] tempD = new double[iMatrix.length-1][iMatrix.length-1];
        for(int i=0, m=0; i<iMatrix.length; ++i)
        {
            for (int j=0, n=0; j<iMatrix.length; ++j)
            {
                if(i != row && j != column)
                {
                    tempD[m][n] = iMatrix[i][j];
                    n++;
                }
            }
            if (i != row)
                m++;
        }
        return tempD;
    }

    /**
     * Calculate the determinant of the matrix and return the result.
     * @param iMatrix a matrix
     * @return determinant of the matrix.
     */
    public  double determinant(double[][] iMatrix)
    {
        double result = 0;
        //If the matrix has 1 dimension, return itself
        if (iMatrix.length == 1)
            return iMatrix[0][0];

        //If the matrix has 2 dimension, calculate its determinant
        else if(iMatrix.length == 2)
            return iMatrix[0][0] * iMatrix[1][1] - iMatrix[0][1] * iMatrix[1][0];

        //Else find the minor of the matrix and calculates their determinants
        else {
            for (int i=0; i<iMatrix[0].length; ++i)
            {
                /*Call SubArray for get matrix of minors.
                 First calculates determinant of the minors then uses this determinant
                 for the calculates determinant of the given matrix. */
                double[][] tempD = subArray(iMatrix,0, i);
                result += iMatrix[0][i] * Math.pow(-1,i) * determinant(tempD);
            }
            return result;
        }
    }

    /**
     * Calculates determinant of the the matrix. Then find the adjoint matrix of the the matrix
     * Finally multiply adjoint matrix with the 1/determinant.
     * @param iMatrix a matrix
     * @return inverse of the matrix.
     */
    public  double[][] inverse (double[][] iMatrix) {
        double determinant = 1 / determinant(iMatrix);
        double[][] adjoint = adjoint(iMatrix);
        for (int i=0; i<adjoint.length; ++i)
        {
            for(int j=0; j<adjoint.length; ++j)
            {
                adjoint[i][j] = determinant * adjoint[i][j];
            }
        }
        return adjoint;
    }

    /**
     * Find adjoint of the the matrix.
     * @param iMatrix a matrix
     * @return result, adjoint matrix of the the matrix.
     */
    public  double[][] adjoint (double[][] iMatrix)
    {
        double[][] result = new double[iMatrix.length][iMatrix.length];
        for (int i=0; i<iMatrix.length; ++i)
        {
            for(int j=0; j<iMatrix.length; ++j)
            {
                double[][] tempD = subArray(iMatrix, i, j);
                result[j][i] = Math.pow(-1,j) * determinant(tempD);
            }
        }
        return result;
    }
}
