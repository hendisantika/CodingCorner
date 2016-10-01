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
public class MergeSort {

    public static void main(String[] args) {
        int list[] = new int[50];
        int i, n;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers ? \t");
        n = scan.nextInt();
        System.out.print("\n\n");
        for (i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1));
            list[i] = scan.nextInt();
        }
        scan.close();
        partition(list, 0, n - 1);
        System.out.print("\n\nAfter merge sort:\n");
        for (i = 0; i < n; i++) {
            System.out.print("\t" + list[i]);
        }
        System.out.print("\n\n");
    }

    private static void partition(int[] list, int low, int high) {
        int mid;

        if (low < high) {
            mid = (low + high) / 2;
            partition(list, low, mid);
            partition(list, mid + 1, high);
            mergeSort(list, low, mid, high);
        }

    }

    private static void mergeSort(int[] list, int low, int mid, int high) {
        int i, midd, k, loww;
        int[] temp = new int[50];
        loww = low;
        i = low;
        midd = mid + 1;
        while ((loww <= mid) && (midd <= high)) {
            if (list[loww] <= list[midd]) {
                temp[i] = list[loww];
                loww++;
            } else {
                temp[i] = list[midd];
                midd++;
            }
            i++;
        }
        if (loww > mid) {
            for (k = midd; k <= high; k++) {
                temp[i] = list[k];
                i++;
            }
        } else {
            for (k = loww; k <= mid; k++) {
                temp[i] = list[k];
                i++;
            }
        }

        for (k = low; k <= high; k++) {
            list[k] = temp[k];
        }

    }
}
