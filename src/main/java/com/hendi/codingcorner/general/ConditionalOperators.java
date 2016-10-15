/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.general;

import static com.oracle.jrockit.jfr.Transition.To;
import java.util.Scanner;

/**
 *
 * @author hendisantika
 */
public class ConditionalOperators {

    public static void main(String[] args) {
        int num1, num2, e;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:\t");
        num1 = scan.nextInt();
        System.out.println("Enter another number :\t");
        num2 = scan.nextInt();
        scan.close();
        e = (num1 > num2) ? num1 : num2;
        System.out.println(e + "  is the greatest of two");
    }
}
