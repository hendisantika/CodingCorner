/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.matrix;

import java.util.Scanner;
import static javax.management.Query.lt;

/**
 *
 * @author hendisantika
 */
public class Trace {

    public static void main(String[] args) {
        int rows, columns, i, j, trace = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter order of matrix :  \t");
        rows = scan.nextInt();
        columns = scan.nextInt();
        int matrix[][] = new int[rows][columns];
        System.out.print("Enter elements of the matrix :\n");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns;
                    j++) {
                System.out.print("Enter element m" + (i + 1) + (j + 1) + ":\t");
                matrix[i][j] = scan.nextInt();
            }
        }
        scan.close();
        System.out.print("\n\nMATRIX is :\n");
        for (i = 0; i < rows;
                i++) {
            for (j = 0; j < columns;
                    j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.print("\n");
        }
        System.out.print("\nIts TRACE is :\t");
        for (i = 0; i < rows;
                i++) {
            for (j = 0; j < columns;
                    j++) {
                if (i == j) {
                    trace = trace + matrix[i][j];
                }

            }
        }
        System.out.print(trace);
    }
}
