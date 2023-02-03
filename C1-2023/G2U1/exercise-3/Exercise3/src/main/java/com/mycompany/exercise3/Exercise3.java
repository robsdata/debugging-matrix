
package com.mycompany.exercise3;

//Escriba un programa que solicite 2 números enteros y pinte las 4 operaciones matemáticas básicas.

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        
        // Initialize variables
        int firstDigit;
        int secondDigit;
        int sum;
        int substraction;
        int multiplication;
        float division;
        
        // Create Scanner object
        Scanner myObjScanner = new Scanner(System.in);
        
        // Ask user for input
        System.out.println("ENTER FIRST DIGIT: ");
        firstDigit = myObjScanner.nextInt();
        System.out.println("ENTER SECOND DIGIT: ");
        secondDigit = myObjScanner.nextInt();
        
        // Do operation
        sum = firstDigit + secondDigit;
        substraction = firstDigit - secondDigit;
        multiplication = firstDigit * secondDigit;
        division = firstDigit / secondDigit;
        
        // Print results
        System.out.println("RESULTS");
        System.out.println("SUM = " + sum);
        System.out.println("SUBSTRACTION = " + substraction);
        System.out.println("MULTIPLICATION = " + multiplication);
        System.out.println("DIVISION = " + division);
        
        
    }
}
