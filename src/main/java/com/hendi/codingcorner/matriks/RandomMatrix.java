/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.matriks;

import java.util.Random;

/**
 *
 * @author hendisantika
 */
public class RandomMatrix {

    public static void main(String[] args) {
        Random rdm = new Random();
        int nilaiRandom;
        int matrix[][] = new int[5][5];                          //ukuran matrix  
        //input matrix 
        System.out.println("Matrix A\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                nilaiRandom = rdm.nextInt(5);                 //( ) masukan angka bebas
                matrix[i][j] = nilaiRandom;
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
