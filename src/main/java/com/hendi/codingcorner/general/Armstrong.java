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
public class Armstrong {

    public static void main(String[] args) {
        int number, num, sum = 0, remainder;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number :\t");
        number = scan.nextInt();
        scan.close();
        num = number;
        while (num != 0) {
            remainder = num % 10;
            sum = sum + remainder * remainder * remainder;
            num = num / 10;
        }
        if (number == sum) {
            System.out.println(number + "  is an Armstrong number");
        } else {
            System.out.println(number + "  is an not an Armstrong number");
        }
    }
}
