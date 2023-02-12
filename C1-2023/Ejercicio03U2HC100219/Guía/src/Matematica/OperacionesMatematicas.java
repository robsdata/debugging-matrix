/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematica;

/**
 *
 * @author johec
 */
public class OperacionesMatematicas {
    protected double suma(double a, double b) {
        return a + b;
    }

    protected double resta(double a, double b) {
        return a - b;
    }

    protected double multiplicacion(double a, double b) {
        return a * b;
    }
    
    protected double division(double a, double b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        }
        return (double) Math.round((a / b) * 100d) / 100d;
    }
}
