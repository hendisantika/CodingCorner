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
public class SimpleInterest {

    public static void main(String[] args) {
        float SI, p, t, r;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Principle Amount: \t");
        p = scan.nextInt();
        System.out.println("Enter Time Period: \t\t");
        t = scan.nextInt();
        System.out.println("Enter Rate Of Interest: \t");
        r = scan.nextInt();
        scan.close();
        SI = (p * t * r) / 100;

        System.out.println("Simple Interest is " + SI);
    }
}
