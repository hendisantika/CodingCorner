/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.matriks;

import java.text.DecimalFormat;

/**
 *
 * @author hendisantika // 2D Arrays in Java
 */
public class Matrices {

    public static int NROWS = 4;
    public static int NCOLS = 3;

    public static void main(String[] args) {

        // Declare and allocate matrices
        int[][] matrix0 = new int[NROWS][NCOLS];
        int[][] matrix1 = new int[NROWS][NCOLS];
        int[][] sum = new int[NROWS][NCOLS];

        // Initialize the matrices
        for (int row = 0; row < NROWS; row++) {
            for (int col = 0; col < NCOLS; col++) {
                matrix0[row][col] = row * 10 + col;
                matrix1[row][col] = col * 10 + row;
            }
        }

        // Add and multiply the matrices
        sum = addMatrix(matrix0, matrix1);

        // Print the matrices
        System.out.println("First Matrix");
        printMatrix(matrix0);
        System.out.println("Second Matrix");
        printMatrix(matrix1);
        System.out.println("Sum of Matrices");
        printMatrix(sum);
    }

    // Matrix addition
    private static int[][] addMatrix(int[][] m0, int[][] m1) {

        int[][] sumMatrix = new int[NROWS][NCOLS];
        for (int row = 0; row < NROWS; row++) {
            for (int col = 0; col < NCOLS; col++) {
                sumMatrix[row][col]
                        = m0[row][col] + m1[row][col];
            }
        }
        return sumMatrix;
    }

    // Prints a matrix
    private static void printMatrix(int[][] matrix) {

        // Formatter for output
        DecimalFormat fmt = new DecimalFormat("00");

        // Double loop
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(fmt.format(matrix[row][col]) + " ");
            }
            System.out.println();
        }
    }
}
