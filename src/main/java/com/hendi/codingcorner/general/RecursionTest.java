/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.general;

/**
 *
 * @author hendisantika
 */
public class RecursionTest {

    public static void main(String args[]) {
        System.out.println("fibonacci series for length 1 is " + fibonacci(5));
    }

    public static int fibonacci(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Invalid argument for Fibonacci series: "
                    + number);
        }
        //base case of recursion
        if (number == 1 || number == 2) {
            return 1;
        }
        //recursive method call in java
        return fibonacci(number - 2) + fibonacci(number - 1);
    }

}
