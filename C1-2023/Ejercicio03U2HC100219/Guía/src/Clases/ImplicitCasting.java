/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.Scanner;

/**
 *
 * @author johec
 */
public class ImplicitCasting  {
    
    public static void doImplicitCasting(int number) {
        byte byteValue = (byte) number;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("Casteando implicitamente a tipo de variable Byte: " + byteValue);
        System.out.println("Casteando implicitamente a tipo de variable Short: " + shortValue);
        System.out.println("Casteando implicitamente a tipo de variable Long: " + longValue);
        System.out.println("Casteando implicitamente a tipo de variable float: " + floatValue);
        System.out.println("Casteando implicitamente a tipo de variable double: " + doubleValue);
    }
}
