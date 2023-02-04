
package com.mycompany.exercise1;

//The Scanner class is used to get user input, and it is found in the java.util package.
import java.util.Scanner; 

public class Exercise1 {
    
    public static void main(String[] args) {
        
        MensajeBienvenida();
        double average = CalculateAverage();
        MensajeSalida(average);
        
    }
    
    public static void MensajeBienvenida() {
        System.out.println("\nAVERAGE CALCULATOR\n");
    }
        
    public static void MensajeSalida(double average_total) {
        System.out.println("The average is: " + average_total);
    }
    
    public static double CalculateAverage() {
        double total = 0;
        double average = 0;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i < 4; i++) {
            System.out.println("ENTER VALUE " + (i) + ":" );
            total += sc.nextDouble();
            average = total / i;
        }        
        return average;
    }
}
