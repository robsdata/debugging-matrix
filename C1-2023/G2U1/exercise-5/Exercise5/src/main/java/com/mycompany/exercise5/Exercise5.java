
// Write a program that requests the values a and b, and calculates the hypotenuse of a triangle (h) with the following formula.

package com.mycompany.exercise5;
import java.util.Scanner;
import java.lang.Math;

public class Exercise5 {

    public static void main(String[] args) {
        
        // Initialize variables
        float baseTriangle;
        float heightTriangle;
        float calculation; 
        float hypotenuse;
        
        // Create Scanner object
        Scanner myObjScanner = new Scanner(System.in);
        
        // Ask for user input     
        System.out.println("ENTER BASE (m): ");
        baseTriangle = myObjScanner.nextFloat();
        System.out.println("ENTER HEIGHT (m): ");
        heightTriangle = myObjScanner.nextFloat();
        
        // Calculate IMC and print results 
        
        calculation = (float) (Math.pow(baseTriangle, 2) + Math.pow(heightTriangle, 2));
        hypotenuse = (float) (Math.sqrt(calculation));
        System.out.println("THE HYPOTENUSE IS: " + hypotenuse);
        
   
    }
}
