


// Write a program that requests 2 numbers, evaluates and prints which is smaller and larger.

package com.mycompany.exercise2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        
        int firstValue;
        int secondValue;        
        
        // Create a Scanner object
        Scanner myObjScanner = new Scanner(System.in);
       
        // Capture Values
        System.out.println("CALCULATE WHAT VALUE IS HIGHER");
        System.out.println("ENTER FIRST VALUE: ");
        firstValue = myObjScanner.nextInt();
        System.out.println("ENTER SECOND VALUE: ");
        secondValue = myObjScanner.nextInt();
        
        // Evaluate condition & print results
        if (firstValue > secondValue) {
            System.out.println("FIRST VALUE IS HIGHER");
        }else {
            System.out.println("SECOND VALUE IS HIGHER");
        }
        
        
        
    }
}
