
package com.mycompany.main;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        
        Scanner myObjScanner = new Scanner(System.in);

        // Variables
        // Variables Exercise 1
        int digit1;
        int digit2;
        int digit3;
        float total;
        float promedio;
        // Variables Exercise 2
        int firstValue;
        int secondValue;
        // Variables Exercise 3
        int firstDigit;
        int secondDigit;
        int sum;
        int substraction;
        int multiplication;
        float division;
        // Variables Exercise 4
        float weight;
        float height;
        float imc;
        // Variables Exercise 5
        float baseTriangle;
        float heightTriangle;
        float calculation; 
        float hypotenuse;
        
        
        
        
        // Exercise 1
        System.out.println("\n\nAVERAGE CALCULATOR");
        System.out.println("ENTER FIRST VALUE: ");       
        // nextInt() used to read integers
        digit1 = myObjScanner.nextInt(); 
        System.out.println("ENTER SECOND VALUE: ");       
        digit2 = myObjScanner.nextInt();
        System.out.println("ENTER THIRD VALUE: ");       
        digit3 = myObjScanner.nextInt();
        // sum 3 digits and devid by 3
        total = digit1 + digit2 + digit3;
        promedio = total / 3;
        // print results
        System.out.println("THE AVERAGE IS: " + promedio);
        
        
        // Exercise 2
        System.out.println("\n\nCALCULATE WHAT VALUE IS HIGHER");
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
        
        
        // EXERCISE 3
        System.out.println("\n\nMULTI PURPOSE CALCULATOR");
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
        
        
        // EXERCISE 4
        System.out.println("\n\nIBM CALCULATOR");
        System.out.println("ENTER WEIGHT (kg): ");
        weight = myObjScanner.nextFloat();
        System.out.println("ENTER HEIGHT (m): ");
        height = myObjScanner.nextFloat();
        // Calculate IMC and print results 
        imc = (float) (weight / Math.pow(height, 2));
        System.out.println("YOUR IMC IS: " + imc);
        
        
        // EXERCISE 5
        System.out.println("\n\nHYPOTENUSE CALCULATOR");
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
