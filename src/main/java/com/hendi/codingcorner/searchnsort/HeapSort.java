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
public class HeapSort {

    public static void main(String[] args) {
        int no, i, j, c, root, temp;
        int heap[] = new int[100];
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers? \t");
        no = scan.nextInt();
        System.out.print("\n\n");
        for (i = 0; i < no; i++) {
            System.out.print("Enter number" + (i + 1));
            heap[i] = scan.nextInt();
        }
        scan.close();
        for (i = 1; i < no; i++) {
            c = i;
            do {
                root = (c - 1) / 2;
                if (heap[root] < heap[c]) {
                    temp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }
                c = root;
            } while (c != 0);
        }

        System.out.print("\n\nThe Heap array  is: \n\n");
        for (i = 0; i < no; i++) {
            System.out.print(heap[i] + "\t");
        }
        for (j = no - 1; j >= 0; j--) {
            temp = heap[0];
            heap[0] = heap[j];
            heap[j] = temp;
            root = 0;
            do {
                c = 2 * root + 1;
                if ((heap[c] < heap[c + 1]) && c < (j - 1)) {
                    c++;
                }
                if (heap[root] < heap[c] && c < j) {
                    temp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }
                root = c;
            } while (c < j);
        }
        System.out.print("\n\nThe sorted array is : \n\n");
        for (i = 0; i < no; i++) {
            System.out.print(heap[i] + "\t");
        }
    }
}
