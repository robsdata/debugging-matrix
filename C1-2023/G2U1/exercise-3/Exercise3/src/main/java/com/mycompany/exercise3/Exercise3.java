
package com.mycompany.exercise3;

// Escriba un programa que solicite 2 números enteros y pinte las 4 operaciones matemáticas básicas.

import java.util.Scanner;

class Values {
      Scanner input = new Scanner(System.in);
      float a = input.nextFloat();
      float b = input.nextFloat();      
}

public class Exercise3 {

    public static void welcomeMessage(){
        System.out.println("WELCOME TO THIS BASIC CALCULATOR");
        System.out.println("ENTER THE DIGITS TO EVALUATE: ");
    }
    
    public static void basicOperations(float a, float b) {
        float sum = a + b;
        float substraction = a - b;
        float multiplication = a * b;
        float division = a / b;
        // Print results
        System.out.println("RESULTS");
        System.out.println("SUM = " + sum);
        System.out.println("SUBSTRACTION = " + substraction);
        System.out.println("MULTIPLICATION = " + multiplication);
        System.out.println("DIVISION = " + division);
    }
    
    
    public static void main(String[] args) {
        welcomeMessage();
        Values userInput = new Values();
        basicOperations(userInput.a, userInput.b);
    }
}
