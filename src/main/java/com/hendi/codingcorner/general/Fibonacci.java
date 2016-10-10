package com.hendi.codingcorner.general;

import java.util.Scanner;

public class Fibonacci {

    public int dapatFibo(int angka1, int angka2) {
        int kembali = 0;
        kembali = angka1 + angka2;
        return kembali;
    }

    public void generateFibo(int batas) {
        Fibonacci fibo = new Fibonacci();

        int angka1 = 0;
        int angka2 = 1;
        int tampung = 0;

        System.out.print("Fibonacci dari angka " + batas + " = " + angka1 + " , " + angka2);
        for (int i = 0; i < (batas - 2); i++) {
            tampung = fibo.dapatFibo(angka1, angka2);
            System.out.print(" , " + tampung);
            angka1 = angka2;
            angka2 = tampung;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fibonacci fibo = new Fibonacci();
        System.out.print("Masukan batas angka fibonacci : ");
        int batas = input.nextInt();
        fibo.generateFibo(batas);

    }
}
