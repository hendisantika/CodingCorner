/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.kleene;

/**
 *
 * @author hendisantika
 */
public class Kleene {
    public static String kleene(String _a, String _b){
        String res = "";
        String[] a = _a.replaceAll("\\{|\\}", "").split(",");
        String[] b = _b.replaceAll("\\{|\\}", "").split(",");
        String an, bn;
        for (int i = 0; i < a.length; i++) {
            an = a[i].trim();
            for (int j = 0; j < b.length; j++) {
            bn = b[j].trim();
            res += String.format("%s%s,", an, bn);
            }
        }
        return "{" + res.replaceAll(",$", "") + "}";
    }
    
    public static void main(String[] args) {
        String a = "{1,0}";
        String a2 = kleene(a, a);
        String a3 = kleene(a2, a);
        String a4 = kleene(a3, a);
        
        System.out.println("A = " + a);
        System.out.println("A2 = " + a2);
        System.out.println("A3 = " + a3);
        System.out.println("A4 = " + a4);
    }
}
