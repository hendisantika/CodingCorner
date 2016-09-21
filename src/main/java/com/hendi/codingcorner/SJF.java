/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner;

import java.util.Scanner;

/**
 *
 * @author hendisantika
 * Short Job First (SJF)
 */
public class SJF {

    public static void main(String[] args) {
        int i, j, temp, temp2, n;
        float avgWt, totalWt = 0;
        int a[] = new int[10];
        int[] bt;
        int[] wt;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter how many jobs ?\t");
            n = scan.nextInt();
            bt = new int[100];
            wt = new int[100];
            wt[1] = 0;
            for (i = 1; i <= n; i++) {
                System.out.print("Enter burst time for job " + i);
                bt[i] = scan.nextInt();
                a[i] = i; // stores job has how much burst time in array i
            }
        }
        for (i = 1; i <= n; i++) // ascending order of burst times and a[i]
        {
            for (j = i; j <= n; j++) {
                if (bt[i] > bt[j]) {
                    temp = bt[i];
                    bt[i] = bt[j];
                    bt[j] = temp;
                    temp2 = a[i];
                    a[i] = a[j];
                    a[j] = temp2;
                }
            }
        }

        System.out.print("\nWaiting time for Job " + a[i] + " : 0 units \t");
        for (i = 2; i <= n; i++) {
            wt[i] = bt[i - 1] + wt[i - 1];
            System.out.print("\nWaiting time for Job" + a[i] + ":\t" + wt[i]
                    + " units \t");
            totalWt = totalWt + wt[i];
        }
        System.out.print("\n\nThe total waiting time : " + totalWt);
        avgWt = totalWt / n;
        System.out.println("\n\nAverage waiting time : " + avgWt);
    }
}
