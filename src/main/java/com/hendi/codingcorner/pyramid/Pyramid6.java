/*
        Java Pyramid 6 Example
        This Java Pyramid example shows how to generate pyramid or triangle like
        given below using for loop.
       
        *****
        ****
        ***
        **
        *
        *
        **
        ***
        ****
        *****
 
 */
package com.hendi.codingcorner.pyramid;

/**
 *
 * @author hendisantika
 */
public class Pyramid6 {

    public static void main(String[] args) {

        //generate upper half of the pyramid
        for (int i = 5; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            //create a new line
            System.out.println("");
        }

        //generate bottom half of the pyramid
        for (int i = 1; i <= 5; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            //create a new line
            System.out.println("");
        }

    }
}
 
/*
 
Output of the example would be
*****
****
***
**
*
*
**
***
****
*****
 
*/
