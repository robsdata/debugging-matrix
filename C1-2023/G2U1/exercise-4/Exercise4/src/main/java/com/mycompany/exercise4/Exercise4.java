
// Escriba un programa que solicite al usuario su peso, su altura y calcule su IMC (Índice de masa corporal) con la siguiente formula.Escriba un programa que solicite al usuario su peso, su altura y calcule su IMC (Índice de masa corporal) con la siguiente formula.

package com.mycompany.exercise4;
import java.util.Scanner;
import java.lang.Math;

public class Exercise4 {

    public static void main(String[] args) {
        
        // Initialize variables
        float weight;
        float height;
        float imc;
        
        // Create Scanner object
        Scanner myObjScanner = new Scanner(System.in);
        
        // Ask for user input     
        System.out.println("ENTER WEIGHT (kg): ");
        weight = myObjScanner.nextFloat();
        System.out.println("ENTER HEIGHT (m): ");
        height = myObjScanner.nextFloat();
        
        // Calculate IMC and print results 
        imc = (float) (weight / Math.pow(height, 2));
        System.out.println("YOUR IMC IS: " + imc);
        
        
        
    }
}
