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
public class MatrixMultiD2 {

    public static void main(String args[]) {

        int i, j, k;
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array a");
        int rowa = sc.nextInt();
        int cola = sc.nextInt();

        System.out.println("Enter size of array b");
        int rowb = sc.nextInt();
        int colb = sc.nextInt();

        //read and b
        System.out.println("Enter elements of array a");
        for (i = 0; i < rowa; ++i) {
            for (j = 0; j < cola; ++j) {

                a[i][j] = sc.nextInt();

            }
            System.out.println();
        }
        System.out.println("Enter elements of array b");
        for (i = 0; i < rowb; ++i) {
            for (j = 0; j < colb; ++j) {

                b[i][j] = sc.nextInt();

            }
            System.out.println("\n");
        }

        //print a and b
        System.out.println("the elements of array a");
        for (i = 0; i < rowa; ++i) {
            for (j = 0; j < cola; ++j) {

                System.out.print(a[i][j]);
                System.out.print("\t");

            }
            System.out.println("\n");
        }
        System.out.println("the elements of array b");
        for (i = 0; i < rowb; ++i) {
            for (j = 0; j < colb; ++j) {

                System.out.print(b[i][j]);
                System.out.print("\t");

            }
            System.out.println("\n");

        }

        //multiply a and b
        for (i = 0; i < rowa; ++i) {

            for (j = 0; j < colb; ++j) {
                c[i][j] = 0;
                for (k = 0; k < cola; ++k) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        //print multi result
        System.out.println("result of multiplication of array a and b is ");
        for (i = 0; i < rowa; ++i) {
            for (j = 0; j < colb; ++j) {

                System.out.print(c[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }
    }
}
