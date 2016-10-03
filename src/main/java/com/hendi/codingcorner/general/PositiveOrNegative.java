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
public class PositiveOrNegative {

    public static void main(String[] args) {
        float a;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number :\n");
        a = scan.nextFloat();

        scan.close();

        if (a == 0) {
            System.out.println(a + " is neither positive nor negative");
        } else if (a > 0) {
            System.out.println(a + " is a Positive number");
        } else {
            System.out.println(a + " is a Negative number");
        }
    }
}
