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
public class LinearSearch {

    public static void main(String[] args) {
        int key, i, n;
        int[] array = new int[100];
        Scanner scan = new Scanner(System.in);
        System.out.print("How many elements? \t");
        n = scan.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Enter number" + (i + 1) + ":\t");
            array[i] = scan.nextInt();
        }

        System.out.print("\nEnter the number to search:\t");
        key = scan.nextInt();
        scan.close();
        for (i = 0; i < n; i++) {
            if (array[i] == key) {
                System.out.println(key + " is present at position " + (i + 1));
                break;
            }
        }
        if (i == n) {
            System.out.println(key + " is not present in array.");
        }
    }
}
