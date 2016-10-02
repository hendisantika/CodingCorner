/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.searchnsort;

import java.util.Scanner;

/**
 *
 * @author hendisantika
 */
public class BubbleSort {

    public static void main(String[] args) {
        int n, i, j, swap;
        int[] array = new int[100];
        Scanner scan = new Scanner(System.in);

        System.out.print("How many Elements ? \t");
        n = scan.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print("Enter number" + (i + 1));
            array[i] = scan.nextInt();
        }
        scan.close();

        for (i = 0; i < (n - 1); i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        System.out.print("\nSorted list :\n");
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
