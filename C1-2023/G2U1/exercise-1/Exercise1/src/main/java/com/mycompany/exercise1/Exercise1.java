
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
        
        System.out.println("\nAVERAGE CALCULATOR\n");
        System.out.println("ENTER FIRST VALUE: ");       
        
        // nextInt() used to read integers
        digit1 = myObj.nextInt(); 
        System.out.println("ENTER SECOND VALUE: ");       
        digit2 = myObj.nextInt();
        System.out.println("ENTER THIRD VALUE: ");       
        digit3 = myObj.nextInt();
        
        // sum 3 digits and devid by 3
        total = digit1 + digit2 + digit3;
        promedio = total / 3;
        
        // print results
        System.out.println("THE AVERAGE IS: " + promedio);
    }
}
