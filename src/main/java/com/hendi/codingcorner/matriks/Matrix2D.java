/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.matriks;

/**
 *
 * @author hendisantika
 */
public class Matrix2D {

    public static void main(String[] args) {
//        int[][] scores = {{20, 18, 22, 20, 16},
//                            {18, 20, 18, 21, 20},
//                            {16, 18, 16, 20, 24},
//                            {25, 24, 22, 24, 25}
//                            };
        int[][] matriksA = {{2, 8},
                            {7, 5}
                            };
        int[][] matriksB = {{20, 18, 22, 20, 16},
                            {18, 20, 18, 21, 20},
                            {16, 18, 16, 20, 24},
                            {25, 24, 22, 24, 25}
                            };

        System.out.println("Matriks A");
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                System.out.print(" " + matriksA[i][j]);

            }
            System.out.println("\n");

        }

        System.out.println("Matriks B");
        for (int i = 0; i < matriksB.length; i++) {
            for (int j = 0; j < matriksB[i].length; j++) {
                System.out.print(" " + matriksB[i][j]);

            }
            System.out.println("\n");

        }

    }

}
