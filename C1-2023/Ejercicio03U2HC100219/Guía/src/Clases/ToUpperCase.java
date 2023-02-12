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
public class ToUpperCase {
    public static void printToUpperCase(String[] datos) {
        for (String dato : datos) {
            System.out.print(dato.toUpperCase() + " ");
        }
        System.out.println();
    }
}
