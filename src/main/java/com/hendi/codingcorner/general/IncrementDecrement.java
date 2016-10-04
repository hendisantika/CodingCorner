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
public class IncrementDecrement {

    public static void main(String[] args) {
        int number, postdecrement, preincrement, predecrement, postincrement;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number :\t");
        number = scan.nextInt();
        scan.close();

        preincrement = ++number;
        predecrement = --number;
        postincrement = number++;
        postdecrement = number--;

        System.out.println("Preincrement is " + preincrement);
        System.out.println("Predecrement  is " + predecrement);
        System.out.println("Postincrement  is " + postincrement);
        System.out.println("Postdecrement  is " + postdecrement);
        System.out.println("The value of original number is " + number);
    }
}
