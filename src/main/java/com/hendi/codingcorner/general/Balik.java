package com.hendi.codingcorner.general;

import java.util.Scanner;

/**
 *
 * @author hendisantika
 */
public class Balik {
//    public static void main(String[] args) {
//        StringBuffer kata = new StringBuffer("ABCDE");
//        System.out.println(kata.reverse());
//    }
// 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kata, rev = "";

        System.out.print("Masukkan kata : ");
        kata = scan.nextLine();

        for (int i = kata.length() - 1; i >= 0; i--) {
            rev = rev + kata.charAt(i);
        }

        System.out.println("Kata dibalik : " + rev);
    }

}
