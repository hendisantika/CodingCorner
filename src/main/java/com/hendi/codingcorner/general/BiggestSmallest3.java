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
public class BiggestSmallest3 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: \t");
        a = scan.nextInt();
        System.out.println("Enter Second Number: \t");
        b = scan.nextInt();
        System.out.println("Enter Third Number: \t");
        c = scan.nextInt();

        scan.close();

        biggestNumber(a, b, c);
        smallestNumber(a, b, c);
    }

    private static void smallestNumber(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a + "  is the biggest number of the 3\n");
        } else if (b < a && b < c) {
            System.out.println(b + "  is the biggest number of the 3\n");
        } else {
            System.out.println(c + "  is the biggest number of the 3\n");
        }

    }

    private static void biggestNumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + "  is the biggest number of the 3\n");
        } else if (b > a && b > c) {
            System.out.println(b + "  is the biggest number of the 3\n");
        } else {
            System.out.println(c + "  is the biggest number of the 3\n");
        }

    }
}
