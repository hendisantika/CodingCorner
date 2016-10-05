/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.general;

import java.util.Scanner;

/**
 *
 * @author hendisantika
 */
public class Average {

    public static void main(String[] args) {
        int n, i, numbers, sum = 0;
        float avg;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many numbers do u want find the average :\t");
        n = scan.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print("\tEnter number" + i + " \t");
            numbers = scan.nextInt();
            sum = sum + numbers;
        }
        scan.close();
        avg = sum / n;
        System.out.println("\tAverage of " + n + " numbers you have entered is : " + avg);

    }
}
