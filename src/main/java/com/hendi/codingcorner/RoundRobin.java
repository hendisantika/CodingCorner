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
 */
public class RoundRobin {

    public static void main(String[] args) {
        int i, j, n, r, q, e = 0;
        int bt_c[] = new int[10];
        int bt[] = new int[10];
        int m[] = new int[50];
        float f, avg = 0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("\nEnter how many jobs ?\t");
            n = scan.nextInt();
            for (i = 1; i <= n; i++) {
                System.out.print("Enter burst time for job " + i + " :\t");
                bt[i] = scan.nextInt();
                bt_c[i] = bt[i]; // stores job has how much burst time in array i
            }
            System.out.print("\nEnter Quantum (time slice value) :\t");
            q = scan.nextInt();
            int max = 0;
            max = bt[1];
            for (j = 1; j <= n; j++) {
                if (max <= bt[j]) {
                    max = bt[j];
                }
            }
            
            if ((max % q) == 0) {
                r = (max / q);
            } else {
                r = (max / q) + 1;
            }
            for (i = 1; i <= r; i++) {
                System.out.print("\n\nRound" + i);
                for (j = 1; j <= n; j++) {
                    if (bt[j] > 0) {
                        bt[j] = bt[j] - q;
                        
                        if (bt[j] <= 0) {
                            bt[j] = 0;
                            System.out.print("\njob " + j + " is completed");
                        } else {
                            System.out.print("\njob" + j + " remaining time is " + bt[j]);
                        }
                    }
                }
                
            }
            for (i = 1; i <= n; i++) {
                e = 0;
                for (j = 1; j <= r; j++) {
                    if (bt_c[i] != 0) {
                        if (bt_c[i] >= q) {
                            m[i + e] = q;
                            bt_c[i] -= q;
                        } else {
                            m[i + e] = bt_c[i];
                            bt_c[i] = 0;
                        }
                    } else {
                        m[i + e] = 0;
                    }
                    e = e + n;
                }
            }
            for (i = 2; i <= n; i++) {
                for (j = 1; j <= i - 1; j++) {
                    avg = avg + m[j];
                }
            }
            for (i = n + 1; i <= r * n; i++) {
                if (m[i] != 0) {
                    for (j = i - (n - 1); j <= i - 1; j++) {
                        avg = m[j] + avg;
                    }
                }
            }
            f = avg / n;
            System.out.print("\n\n\nTOTAL WATING TIME: \t" + avg);
            System.out.print("\n\nAVERAGE WAITING TIME: \t\n" + f);
        }
    }
}
