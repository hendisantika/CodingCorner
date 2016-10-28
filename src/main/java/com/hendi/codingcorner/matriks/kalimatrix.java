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
public class kalimatrix {

    private int matrix_A[][];
    private int matrix_B[][];
    private int hasil[][];
    private int bA, kA, bB, kB;
    Scanner input = new Scanner(System.in);

    //konstruktor
    public kalimatrix() {
    }

    ;
 
 //set matrix A
 public void setA() {
        System.out.println("Inputkan Matrix Pertama");
        System.out.print("Tentukan baris : ");
        this.bA = input.nextInt();
        System.out.print("Tentukan kolom : ");
        this.kA = input.nextInt();
    }
    //inputan matrix A

    public void inputA() {
        System.out.println("Inputkan nilai Matrix pertama ");
        this.matrix_A = new int[this.bA][this.kA];

        for (int i = 0; i < this.bA; i++) //baris 
        {
            for (int j = 0; j < this.kA; j++) {
                System.out.print("inputkan nilai matrik baris " + (i + 1) + " kolom " + (j + 1) + " : ");
                this.matrix_A[i][j] = input.nextInt();
            }
        }
    }

    //cetak matrix A
    public void cetakA() {
        for (int i = 0; i < this.bA; i++) //baris 
        {
            for (int j = 0; j < this.kA; j++) {
                System.out.print("[" + this.matrix_A[i][j] + "] ");
            }
            System.out.println();
        }
    }

    //set matrix A
    public void setB() {
        System.out.println("Inputkan Matrix Kedua");
        System.out.print("Tentukan baris : ");
        this.bB = input.nextInt();
        System.out.print("Tentukan kolom : ");
        this.kB = input.nextInt();
    }

    //inputan matrix B
    public void inputB() {
        System.out.println("Inputkan nilai Matrix Kedua ");
        this.matrix_B = new int[this.bB][this.kB];

        for (int i = 0; i < this.bB; i++) //baris 
        {
            for (int j = 0; j < this.kB; j++) {
                System.out.print("inputkan nilai matrik baris " + (i + 1) + " kolom " + (j + 1) + " : ");
                this.matrix_B[i][j] = input.nextInt();
            }
        }
    }

    //cetak matrix B
    public void cetakB() {
        for (int i = 0; i < this.bB; i++) //baris 
        {
            for (int j = 0; j < this.kB; j++) {
                System.out.print("[" + this.matrix_B[i][j] + "] ");
            }
            System.out.println();
        }
    }

    //kali matrix
    public void kali() {
        this.hasil = new int[this.bA][this.kB];
        for (int i = 0; i < this.bA; i++) {
            for (int j = 0; j < this.kB; j++) {
                this.hasil[i][j] = 0;
                for (int k = 0; k < this.kA; k++) {
                    this.hasil[i][j] = this.hasil[i][j] + this.matrix_A[i][k] * this.matrix_B[k][j];
                }
            }
            System.out.println();
        }
    }

    //cetak hasil
    public void hasil() {
        for (int i = 0; i < this.bA; i++) //baris 
        {
            for (int j = 0; j < this.kB; j++) {
                System.out.print("[" + this.hasil[i][j] + "] ");
            }
            System.out.println();
        }
    }

    public static void main(String[] argh) {
        kalimatrix wew = new kalimatrix();
        wew.setA();
        System.out.println("----------------");
        wew.setB();
        System.out.println("----------------");
        //kondisi matrix
        if (wew.kA != wew.bB) {
            System.out.println("Maaf, Syarat matrix tidak memenuhi !");
        } else {
            wew.inputA();
            System.out.println("----------------");
            wew.inputB();
            System.out.println("Matrix A");
            wew.cetakA();
            System.out.println("Matrix B");
            wew.cetakB();
            wew.kali();
            System.out.println("Matrix A X Matrix B");
            wew.hasil();
        }

    }
}
