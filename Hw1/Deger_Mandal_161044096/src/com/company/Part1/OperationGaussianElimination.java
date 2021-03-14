package com.company.Part1;

import java.util.Scanner;

public class OperationGaussianElimination implements LinearStrategy {

    /**
     * The number of variables of the linear equations.
     */
    private int unknownVariables;
    /**
     * The coefficients of the linear equations.
     */
    private double[][] coefficient;
    /**
     * The solutions of the linear qeuations.
     */
    private double[] solution;

    /**
     * Default constructor.
     * Take from the user, the number of linear equations, coefficients and solutions.
     */
    public OperationGaussianElimination() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, write number of unknown variables:");
        unknownVariables = scan.nextInt();
        while (unknownVariables <= 1)
        {
            System.out.println("Number of unknown variables must be bigger than 1, write again:");
            unknownVariables = scan.nextInt();
        }
        coefficient = new double[unknownVariables][unknownVariables];
        solution = new double[unknownVariables];

        int temp;
        System.out.println("Write equation's coefficients =>");
        for (int i=0; i < unknownVariables; ++i)
        {
            temp = i+1;
            System.out.println(temp + ". coefficents:");
            for (int j=0; j < unknownVariables; ++j)
            {
                coefficient[i][j] = scan.nextDouble();
            }
        }

        System.out.println("Write solutions:");
        for (int i=0; i < unknownVariables;++i)
        {
            temp = i + 1;
            System.out.println(temp + ". solution:");
            solution[i] = scan.nextDouble();
        }

    }

    /**
     * Solve the linear equations with the two helpers method
     */
    @Override
    public void solution() {
        findMatrix(coefficient, solution);
        backSubstition(coefficient, solution);
        int i = 0;
        StringBuilder tempS = new StringBuilder();
        tempS.append("[ ");
        do{
            tempS.append(solution[i]);
            i++;
        }while(i<solution.length && tempS.append(", ") == tempS );
        tempS.append(" ]");
        System.out.println(tempS.toString());
    }

    /**
     * Use back substituion to find solutions.
     * @param matrix upper triangular matrix
     * @param solution solutions of the equations
     */
    public void backSubstition(double[][] matrix, double[] solution)
    {
        for(int i=matrix.length-1; i>=0; --i)
        {
            for(int j=i+1; j<matrix.length; ++j)
            {
                solution[i] -= (matrix[i][j] * solution[j]);
            }
            solution[i] = solution[i] / matrix[i][i];
        }
    }

    /**
     * Take coefficents as a matrix and solution as a list.
     * Find an upper triangular matrix.
     * @param matrix equation matrix
     * @param solution solutions of the equations
     */
    public void findMatrix(double[][] matrix, double [] solution){
        for(int i=0; i<matrix.length; ++i)
        {
            int max = i;
            for(int row =i; row<matrix.length; ++row)
            {
                if (matrix[row][i] > matrix[max][i])
                    max = row;
            }
            //Swapping
            double[] tempD = matrix[i];
            matrix[i] = matrix[max];
            matrix[max] = tempD;

            //Swapping
            double tempS = solution[i];
            solution[i] = solution[max];
            solution[max] = tempS;

            /* Use the equation to make elements zero:
             matrix[target][col]=matrix[target][col]-matrix[max_row][col]*(matrix[target][0]/matrix[max_row][0])
             */
            for (int row=i+1; row<matrix.length; ++row)
            {
                double factor = matrix[row][i] / matrix[i][i];
                for (int j=i; j<matrix.length; ++j)
                {
                    matrix[row][j] = matrix[row][j] - factor * matrix[i][j];
                }
                solution[row]=solution[row]-solution[i]*factor;
            }
        }
    }

}
