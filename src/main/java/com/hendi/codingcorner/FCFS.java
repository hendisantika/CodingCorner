/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner;

import java.util.Scanner;

/**
 *
 * @author hendisantika This is a Java program which implements one of the CPU
 * Scheduling algorithm called First Come First Served(FCFS).
 *
 * FCFS is the simplest scheduling algorithm , easy to understand and implement
 * but not as efficient as remaining scheduling algorithms as its waiting time
 * is high.
 *
 * As the name suggests , here the processes/jobs are executed on first come
 * first serve basis.
 */
public class FCFS {

    public static void main(String[] args) {
        int i, n;
        float avgWt, totalWt = 0;
        int[] bt;
        int[] wt;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter how many jobs ?\t");
            n = scan.nextInt();
            bt = new int[n];
            wt = new int[n];
            for (i = 0; i < n; i++) {
                System.out.print("Enter burst time for job " + (i + 1) + " :\t");
                bt[i] = scan.nextInt();
            }
        }
        System.out.print("\n\nWaiting time for Job 1 : 0 units\t");
        wt[0] = 0;
        for (i = 1; i < n; i++) {
            wt[i] = bt[i - 1] + wt[i - 1];
            System.out.print("\nWaiting time for Job" + (i + 1) + " : " + wt[i] + " units \t");
            totalWt = totalWt + wt[i];
        }
        System.out.print("\n\nThe total waiting time : " + totalWt);
        avgWt = totalWt / n;
        System.out.println("\n\nAverage waiting time : " + avgWt);
    }
}
