package com.hendi.codingcorner.general;

import java.util.Scanner;

/**
 *
 * @author hendisantika
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, fak;
        fak = 1;

        System.out.print("Masukkan angka : ");
        n = input.nextInt();

        if (n > 0) {
            for (i = 1; i < n; i++) {
                fak = fak * (n - i);
            }
            fak = fak * n;
        } else {
            fak = 1;
        }

        System.out.println(+n + "! = " + fak);
    }
}
