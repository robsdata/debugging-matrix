/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author johec
 */
public class arraySum {
    public static void calculateSumAndAverage(int[] datos) {
        int sum = 0;
        for (int i = 0; i < datos.length; i++) {
            sum += datos[i];
        }
        double average = (double) sum / datos.length;
        System.out.println("Suma de los valores: " + sum);
        System.out.println("Promedio de los valores: " + average);
    }
}
