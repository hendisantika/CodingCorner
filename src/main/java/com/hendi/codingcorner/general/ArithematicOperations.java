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
public class ArithematicOperations {

    public static void main(String[] args) {

        int number1;
        int number2;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a number");
            number1 = scan.nextInt();
            System.out.println("Enter another number");
            number2 = scan.nextInt();
        }

        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int division = number1 / number2;

        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + difference);
        System.out.println("Product : " + product);
        System.out.println("Division : " + division);

    }
}
