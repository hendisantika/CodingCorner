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
public class Reverse {

    public static void main(String[] args) {
        int number, remainder, reverse = 0, num;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a number :\t");
//        number = scan.nextInt();
//        scan.close();
        number = 123;
        num = number;
        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reverse of number " + num + " is : \t  " + reverse);
    }
}
