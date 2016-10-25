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
public class BinarySearch {

    public static void main(String[] args) {

        int i, first, last, middle, n, key;
        int[] array = new int[100];

        Scanner scan = new Scanner(System.in);

        System.out.print("How many elements ?\t");
        n = scan.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ":\t");
            array[i] = scan.nextInt();
        }

        System.out.print("\nEnter value to find\t");
        key = scan.nextInt();

        scan.close();

        first = 0;
        last = n - 1;
        middle = (first + last) / 2;

        while (first <= last) {
            if (array[middle] < key) {
                first = middle + 1;
            } else if (array[middle] == key) {
                System.out.println(key + " found at position" + (middle + 1)
                        + "\t");
                break;
            } else {
                last = middle - 1;
            }

            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Not found!" + key
                    + " is not present in the list.\n");
        }
    }
}
