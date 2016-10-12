package com.hendi.codingcorner.general;

/**
 *
 * @author hendisantika
 */
public class PalindromeString {

    public static void main(String[] args) {

        PalindromeString pn = new PalindromeString();

        if (pn.isPalindrome("ABBA")) {

            System.out.println("Palindrome");

        } else {

            System.out.println("Not Palindrome");

        }
    }

    public boolean isPalindrome(String original) {

        int i = original.length() - 1;
        int j = 0;
        while (i > j) {
            if (original.charAt(i) != original.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
