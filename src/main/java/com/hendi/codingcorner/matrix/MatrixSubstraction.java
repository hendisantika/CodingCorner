/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.matrix;

import java.util.Scanner;

/**
 *
 * @author hendisantika
 */
public class MatrixSubstraction {

    public static void main(String[] args) {
        int i, j, rows1, rows2, columns1, columns2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter order of matrix 1 :\t");

        rows1 = scan.nextInt();
        columns1 = scan.nextInt();

        System.out.println("Enter order of matrix 2  :\t");
        rows2 = scan.nextInt();
        columns2 = scan.nextInt();

        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[rows2][columns2];
        int[][] result = new int[rows1][columns1];

        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("Both matrices must have same  of order ");

        } else {
            System.out.println("Enter elements of matrix 1:");
            for (i = 0; i < rows1; i++) {
                for (j = 0; j < columns1; j++) {
                    System.out.print("Enter element m" + (i + 1) + (j + 1));

                    matrix1[i][j] = scan.nextInt();

                }
            }
            System.out.println("Enter elements of matrix 2:");
            for (i = 0; i < rows2; i++) {
                for (j = 0; j < columns2; j++) {
                    System.out.print("Enter element m" + (i + 1) + (j + 1));
                    matrix2[i][j] = scan.nextInt();

                }
            }

            scan.close();

            System.out.println("MATRIX 1 is :");
            for (i = 0; i < rows1; i++) {
                for (j = 0; j < columns1; j++) {
                    System.out.print(matrix1[i][j] + "\t");
                }
                System.out.println("\n");
            }
            System.out.println("MATRIX 2 is :");
            for (i = 0; i < rows2; i++) {
                for (j = 0; j < columns2; j++) {
                    System.out.print(matrix2[i][j] + "\t");
                }
                System.out.println("\n");
            }
            for (i = 0; i < rows1; i++) {
                for (j = 0; j < columns1; j++) {
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            System.out.println("The Difference of two Matrices is : ");
            for (i = 0; i < rows1; i++) {
                for (j = 0; j < columns1; j++) {
                    System.out.print("\t" + result[i][j]);
                }
                System.out.println("\n");
            }
        }
    }
}
