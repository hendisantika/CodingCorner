/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.matriks;

import java.util.Scanner;

/**
 *
 * @author hendisantika
 */
public class MatrixMultiD {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a[][] = {{1, 2, -2, 0}, {-3, 4, 7, 2}, {6, 0, 3, 1}};
        int b[][] = {{-1, 3}, {0, 9}, {1, -11}, {4, -5}};
        int[][] c = multMatrix(a, b);
        printMatrix(a);
        printMatrix(b);
        printMatrix(c);

    }

    public static int[][] readMatrix() {
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = sc.nextInt();
            }
        }
        return result;
    }

    public static void printMatrix(int[][] mat) {
        System.out.println("Matrix[" + mat.length + "][" + mat[0].length + "]");
        int rows = mat.length;
        int columns = mat[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%4d ", mat[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] multMatrix(int a[][], int b[][]) {//a[m][n], b[n][p]
        if (a.length == 0) {
            return new int[0][0];
        }
        if (a[0].length != b.length) {
            return null; //invalid dims
        }
        int n = a[0].length;
        int m = a.length;
        int p = b[0].length;
        int ans[][] = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    ans[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return ans;
    }
}
