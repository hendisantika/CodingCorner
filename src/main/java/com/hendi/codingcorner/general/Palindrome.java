package com.hendi.codingcorner.general;

import java.util.Scanner;

/**
 *
 * @author hendisantika
 */
public class Palindrome {

    public static void main(String[] args) {
        int number, remainder, reverse = 0, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :\t");
        number = scan.nextInt();
        scan.close();
        num = number;
        int i = 0;
        
        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
            System.out.println("Loop ke : "+ i + " remainder : " +  remainder + " reverse :  " + reverse + " number : " + number);
            i++;
        }
        if (reverse == num) {
            System.out.println(num + "  is Palindrome");
        } else {
            System.out.println(num + "  is not a Palindrome");
        }
    }
}
