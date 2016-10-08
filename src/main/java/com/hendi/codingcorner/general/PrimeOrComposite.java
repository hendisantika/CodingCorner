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
public class PrimeOrComposite {

    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to check Prime or Composite ");
        b = scan.nextInt();

        scan.close();

        if (b == 0 || b == 1) {
            System.out.println(b + " is neither Prime nor Composite");
        }

        for (a = 2; a <= b - 1; a++) {
            if (b % a == 0) {
                System.out.println(b + "  is Composite number");
                break;
            }
        }
        if (b == a) {
            System.out.println(b + "  is Prime number ");
        }

    }

}
