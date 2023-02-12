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
public class ExplicitCasting {
    public static void doExplicitCasting(int number) {
        byte byteValue = (byte) number;
        short shortValue = (short) byteValue;
        int intValue = (int) shortValue;
        long longValue = (long) intValue;
        float floatValue = (float) longValue;
        double doubleValue = (double) floatValue;
        
        System.out.println("Casteando explicitamente a tipo de variable Byte: " + byteValue);
        System.out.println("Casteando explicitamente a tipo de variable Short: " + shortValue);
        System.out.println("Casteando explicitamente a tipo de variable int: " + intValue);
        System.out.println("Casteando explicitamente a tipo de variable Long: " + longValue);
        System.out.println("Casteando explicitamente a tipo de variable float: " + floatValue);
        System.out.println("Casteando explicitamente a tipo de variable double: " + doubleValue);
    }
}
