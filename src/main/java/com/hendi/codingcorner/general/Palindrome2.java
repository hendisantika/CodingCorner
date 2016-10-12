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
public class Palindrome2 {

    public static boolean isPalindrome(String S) {
        String rev = new StringBuilder(S).reverse().toString();
        if (S.equals(rev)) {
            System.out.println("Words " + S + " is palindrome");
            return true;
        }
        System.out.println("Words " + S + " is not palindrome");
        return false;
    }
    
//    public static void main(String[] args) {
//        String word = "nani";
//        isPalindrome(word);
//    }
    public static void main(String args[])
   {
      String original, reverse = "";
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to check if it is a palindrome");
      original = in.nextLine();
 
      int length = original.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
 
      if (original.equals(reverse))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
 
   }
            
}
