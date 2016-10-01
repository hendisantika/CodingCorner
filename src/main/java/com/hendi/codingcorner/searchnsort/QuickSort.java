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
public class QuickSort {

    public static void main(String[] args) {

        int n, i;
        int arr[] = new int[20];
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers ? \t");
        n = scan.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("\nEnter number" + (i + 1));
            arr[i] = scan.nextInt();
        }
        scan.close();
        quick_sort(arr, 0, n - 1);
        System.out.print("\n\nThe Sorted Array is:\n\n");
        for (i = 0; i < n; i++) {
            System.out.print("\t" + arr[i]);
        }

    }

    private static void quick_sort(int[] arr, int low, int high) {
        int pivot, j, temp, i;
        if (low < high) {
            pivot = low;
            i = low;
            j = high;
            while (i < j) {
                while ((arr[i] <= arr[pivot]) && (i < high)) {
                    i++;
                }
                while (arr[j] > arr[pivot]) {
                    j--;
                }

                if (i < j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            temp = arr[pivot];
            arr[pivot] = arr[j];
            arr[j] = temp;
            quick_sort(arr, low, j - 1);
            quick_sort(arr, j + 1, high);
        }

    }
}
