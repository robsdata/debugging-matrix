
package com.mycompany.exercise1;

//The Scanner class is used to get user input, and it is found in the java.util package.
import java.util.Scanner; 

public class Exercise1 {
    
    public static void main(String[] args) {
        
        // declaring variables
        int digit1;
        int digit2;
        int digit3;
        float total;
        float promedio;
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("\nCALCULADORA DE PROMEDIOS\n");
        System.out.println("INGRESE EL PRIMER DIGITO: ");       
        
        // nextInt() used to read integers
        digit1 = myObj.nextInt(); 
        System.out.println("INGRESE EL SEGUNDO DIGITO: ");       
        digit2 = myObj.nextInt();
        System.out.println("INGRESE EL TERCER DIGITO: ");       
        digit3 = myObj.nextInt();
        
        // sum 3 digits and devid by 3
        total = digit1 + digit2 + digit3;
        promedio = total / 3;
        
        // print results
        System.out.println("El promedio de los digitos ingresados es: " + promedio);
    }
}
