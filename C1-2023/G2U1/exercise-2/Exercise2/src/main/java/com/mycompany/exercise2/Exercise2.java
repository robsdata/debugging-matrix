


// Write a program that requests 2 numbers, evaluates and prints which is smaller and larger.

package com.mycompany.exercise2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        do {            
            System.out.println("The higher number is: " + DetermineHigherNumber());    
        } while (ContinuePlaying());
        
    }
    
    public static float DetermineHigherNumber() {
        
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
       
        // Capture Values
        System.out.println("CALCULATE WHAT VALUE IS HIGHER");
        System.out.println("ENTER FIRST VALUE: ");
        float a = sc.nextInt();
        System.out.println("ENTER SECOND VALUE: ");
        float b = sc.nextInt();
        
        float higher = (a > b) ? a : b;
        
        return higher;
    }
    
    public static boolean ContinuePlaying(){
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Continue (y) to continue, else to exit...");
        int  userInput = sc.nextInt();
        boolean gameIsRunning = (userInput == 1) ? true : false;
        return gameIsRunning;
  
    }
}
