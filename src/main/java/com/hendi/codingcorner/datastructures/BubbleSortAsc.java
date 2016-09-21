/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.datastructures;

import java.util.Arrays;

/**
 *
 * @author hendisantika
 */
public class BubbleSortAsc {

    public static void main(String[] args) {

        int arrayList[] = {5, 3, 9, 7, 1, 8};
        System.out.println("\nFinal result:" + Arrays.toString(CrunchifyBubbleSortAsceMethod(arrayList)));
    }

    public static int[] CrunchifyBubbleSortAsceMethod(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println((i + 1) + "th iteration result: " + Arrays.toString(arr));
        }
        return arr;
    }

}
