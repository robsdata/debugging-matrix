/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematica;
import Matematica.OperacionesMatematicas;
/**
 *
 * @author johec
 */
public class AccesToProtectedMethods extends OperacionesMatematicas {
    public double suma(double a, double b) {
        return super.suma(a, b);
    }

    public double resta(double a, double b) {
        return super.resta(a, b);
    }

    public double multiplicacion(double a, double b) {
        return super.multiplicacion(a, b);
    }

    public double division(double a, double b) {
        return super.division(a, b);
    }
}

