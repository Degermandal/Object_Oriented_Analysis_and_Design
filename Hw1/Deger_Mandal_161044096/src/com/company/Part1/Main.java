package com.company.Part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinearContext linearC = new LinearContext();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, please select which method will use for the solution!!");
        while (true){
            System.out.println("#.............................................................#");
            System.out.println("Please, write 1 for choosing Gaussian Elimination");
            System.out.println("Please, write 2 for choosing Matrix Inversion");
            System.out.println("Please, write 3 for exit");
            System.out.println("Choice: ");
            int choice=scan.nextInt();
            if (choice==1)
            {
                linearC.doOperation(new OperationGaussianElimination());
                linearC.doSolution();
            }
            else if(choice==2)
            {
                linearC.doOperation(new OperationMatrixInversion());
                linearC.doSolution();
            }
            else if(choice==3)
            {
                System.out.println("Goodbye!!!");
                break;
            }
            else
                System.out.println("Wrong input, please write correct input!!!");
        }
    }
}
