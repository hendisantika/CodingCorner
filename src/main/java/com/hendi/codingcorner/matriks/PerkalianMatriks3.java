/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.codingcorner.matriks;

/**
 *
 * @author hendisantika
 */
public class PerkalianMatriks3 {

    public static void main(String[] args) {
//        int a[][] = {{1, 2, 3}, {4, 5, 6}};
//        int b[][] = {{7, 8, 9}, {4, 5, 6}, {10, 2, 5}};
//        int a[][] = {{2, 3}, {5, 6}};
//        int b[][] = {{3,5,6}, {1,3, 2}};
        int a[][] = {{2, 3, 4}, {5, 6, 7}};
        int b[][] = {{3,5,6}, {1,3, 2}};

        //menampilkan matriks A:
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("==============================");
        //menampilkan matriks B:
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("==============================");
        System.out.println("Perkalian Matriks A x B");
        //hasil matriks
        System.out.println("Hasil matriks AxB: ");

        int m, n, o;
        m = a[0][0] * b[0][0];
        n = a[0][1] * b[1][0];
        o = a[0][2] * b[2][0];
        System.out.print(m + n + o);
        System.out.print(" ");
        int u, v, w;
        u = a[0][0] * b[0][1];
        v = a[0][1] * b[1][1];
        w = a[0][2] * b[2][1];
        System.out.println(u + v + w);

        int p, q, r;
        p = a[1][0] * b[0][0];
        q = a[1][1] * b[1][0];
        r = a[1][2] * b[2][0];
        System.out.print(p + q + r);
        int x, y, z;
        x = a[1][0] * b[0][1];
        y = a[1][1] * b[1][1];
        z = a[1][2] * b[2][1];
        System.out.print(" ");
        System.out.println(x + y + z);

    }
}
