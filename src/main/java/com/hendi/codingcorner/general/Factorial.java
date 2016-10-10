/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.general;

import java.util.Scanner;

/**
 *
 * @author hendisantika
 */
public class Factorial {

    public static void main(String[] args) {
        // TODO code application logic here
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
