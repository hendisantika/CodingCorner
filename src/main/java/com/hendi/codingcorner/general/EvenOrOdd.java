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
public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number");
        int number = scan.nextInt();

        scan.close();

        if (number % 2 == 0) {
            System.out.println(number + " is EVEN number");
        } else {
            System.out.println(number + " is ODD number");
        }

    }
}
