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
public class Swapping {

    public static void main(String[] args) {
        int number1, number2, num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number to swap:\t");
        number1 = scan.nextInt();
        System.out.println("Enter Second number to swap:\t");
        number2 = scan.nextInt();

        scan.close();
        System.out.println("The two numbers before swapping are " + number1 + "\t" + number2);

        num = number1;
        number1 = number2;
        number2 = num;

        System.out.println("The two numbers before swapping are " + number1 + "\t" + number2);
    }
}
